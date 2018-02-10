/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.ReportParameter2Choice;
import com.tools20022.repository.entity.FundsCashFlow;
import com.tools20022.repository.GeneratedRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Parameters used to report cash movements,eg, country code, currency code, BIC
 * or a user defined parameter.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ForecastParameter1#mmReportParameter
 * ForecastParameter1.mmReportParameter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ForecastParameter1#mmEstimatedCashInForecastDetails
 * ForecastParameter1.mmEstimatedCashInForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ForecastParameter1#mmEstimatedCashOutForecastDetails
 * ForecastParameter1.mmEstimatedCashOutForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ForecastParameter1#mmEstimatedNetCashForecastDetails
 * ForecastParameter1.mmEstimatedNetCashForecastDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.FundsCashFlow
 * FundsCashFlow}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ForecastParameter1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Parameters used to report cash movements,eg, country code, currency code, BIC or a user defined parameter."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ForecastParameter1", propOrder = {"reportParameter", "estimatedCashInForecastDetails", "estimatedCashOutForecastDetails", "estimatedNetCashForecastDetails"})
public class ForecastParameter1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RptParam", required = true)
	protected ReportParameter2Choice reportParameter;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ReportParameter2Choice
	 * ReportParameter2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ForecastParameter1
	 * ForecastParameter1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptParam"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportParameter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of parameter used for grouping the information in a report, eg, country code, currency code, BIC or a user defined parameter."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReportParameter = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ForecastParameter1.mmObject();
			isDerived = false;
			xmlTag = "RptParam";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportParameter";
			definition = "Type of parameter used for grouping the information in a report, eg, country code, currency code, BIC or a user defined parameter.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ReportParameter2Choice.mmObject();
		}
	};
	@XmlElement(name = "EstmtdCshInFcstDtls")
	protected List<com.tools20022.repository.msg.CashInForecast1> estimatedCashInForecastDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashInForecast1
	 * CashInForecast1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow FundsCashFlow}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ForecastParameter1
	 * ForecastParameter1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EstmtdCshInFcstDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EstimatedCashInForecastDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash movements into a fund as a result of investment funds transactions, eg, subscriptions or switch-in."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEstimatedCashInForecastDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> FundsCashFlow.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ForecastParameter1.mmObject();
			isDerived = false;
			xmlTag = "EstmtdCshInFcstDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstimatedCashInForecastDetails";
			definition = "Cash movements into a fund as a result of investment funds transactions, eg, subscriptions or switch-in.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashInForecast1.mmObject();
		}
	};
	@XmlElement(name = "EstmtdCshOutFcstDtls")
	protected List<com.tools20022.repository.msg.CashOutForecast1> estimatedCashOutForecastDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashOutForecast1
	 * CashOutForecast1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow FundsCashFlow}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ForecastParameter1
	 * ForecastParameter1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EstmtdCshOutFcstDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EstimatedCashOutForecastDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash movements out of a fund as a result of investment funds transactions, eg, redemptions or switch-out."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEstimatedCashOutForecastDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> FundsCashFlow.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ForecastParameter1.mmObject();
			isDerived = false;
			xmlTag = "EstmtdCshOutFcstDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstimatedCashOutForecastDetails";
			definition = "Cash movements out of a fund as a result of investment funds transactions, eg, redemptions or switch-out.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashOutForecast1.mmObject();
		}
	};
	@XmlElement(name = "EstmtdNetCshFcstDtls")
	protected List<com.tools20022.repository.msg.NetCashForecast1> estimatedNetCashForecastDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NetCashForecast1
	 * NetCashForecast1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow FundsCashFlow}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ForecastParameter1
	 * ForecastParameter1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EstmtdNetCshFcstDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EstimatedNetCashForecastDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net cash movements to a fund as a result of investment funds transactions."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEstimatedNetCashForecastDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> FundsCashFlow.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ForecastParameter1.mmObject();
			isDerived = false;
			xmlTag = "EstmtdNetCshFcstDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstimatedNetCashForecastDetails";
			definition = "Net cash movements to a fund as a result of investment funds transactions.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.NetCashForecast1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ForecastParameter1.mmReportParameter, com.tools20022.repository.msg.ForecastParameter1.mmEstimatedCashInForecastDetails,
						com.tools20022.repository.msg.ForecastParameter1.mmEstimatedCashOutForecastDetails, com.tools20022.repository.msg.ForecastParameter1.mmEstimatedNetCashForecastDetails);
				trace_lazy = () -> FundsCashFlow.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ForecastParameter1";
				definition = "Parameters used to report cash movements,eg, country code, currency code, BIC or a user defined parameter.";
			}
		});
		return mmObject_lazy.get();
	}

	public ReportParameter2Choice getReportParameter() {
		return reportParameter;
	}

	public ForecastParameter1 setReportParameter(ReportParameter2Choice reportParameter) {
		this.reportParameter = Objects.requireNonNull(reportParameter);
		return this;
	}

	public List<CashInForecast1> getEstimatedCashInForecastDetails() {
		return estimatedCashInForecastDetails == null ? estimatedCashInForecastDetails = new ArrayList<>() : estimatedCashInForecastDetails;
	}

	public ForecastParameter1 setEstimatedCashInForecastDetails(List<com.tools20022.repository.msg.CashInForecast1> estimatedCashInForecastDetails) {
		this.estimatedCashInForecastDetails = Objects.requireNonNull(estimatedCashInForecastDetails);
		return this;
	}

	public List<CashOutForecast1> getEstimatedCashOutForecastDetails() {
		return estimatedCashOutForecastDetails == null ? estimatedCashOutForecastDetails = new ArrayList<>() : estimatedCashOutForecastDetails;
	}

	public ForecastParameter1 setEstimatedCashOutForecastDetails(List<com.tools20022.repository.msg.CashOutForecast1> estimatedCashOutForecastDetails) {
		this.estimatedCashOutForecastDetails = Objects.requireNonNull(estimatedCashOutForecastDetails);
		return this;
	}

	public List<NetCashForecast1> getEstimatedNetCashForecastDetails() {
		return estimatedNetCashForecastDetails == null ? estimatedNetCashForecastDetails = new ArrayList<>() : estimatedNetCashForecastDetails;
	}

	public ForecastParameter1 setEstimatedNetCashForecastDetails(List<com.tools20022.repository.msg.NetCashForecast1> estimatedNetCashForecastDetails) {
		this.estimatedNetCashForecastDetails = Objects.requireNonNull(estimatedNetCashForecastDetails);
		return this;
	}
}