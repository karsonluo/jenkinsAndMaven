package com.example.karsondemo.entity;

import lombok.Data;

public class JmeterSampleDTO {
	// 主键uuid
	private String uuid;
	// ip
	private String domain;
	// 端口
	private String port;
	// 协议
	private String protocol;
	// 编码字符集
	private String contentEncoding;
	// 接口地址
	private String path;
	// 请求方式get、post
	private String method;
	// 循环次数
	private String loops;
	// 线程数
	private String numThreads;
	// 对应时间内启动完所有线程
	private String rampTime;
	//请求参数
	private String content;
	//更新时间
	private String updateTiem;
	//创建时间
	private String createTime;

	public String getUpdateTiem() {
		return updateTiem;
	}

	public void setUpdateTiem(String updateTiem) {
		this.updateTiem = updateTiem;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getContentEncoding() {
		return contentEncoding;
	}

	public void setContentEncoding(String contentEncoding) {
		this.contentEncoding = contentEncoding;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getLoops() {
		return loops;
	}

	public void setLoops(String loops) {
		this.loops = loops;
	}

	public String getNumThreads() {
		return numThreads;
	}

	public void setNumThreads(String numThreads) {
		this.numThreads = numThreads;
	}

	public String getRampTime() {
		return rampTime;
	}

	public void setRampTime(String rampTime) {
		this.rampTime = rampTime;
	}

}
