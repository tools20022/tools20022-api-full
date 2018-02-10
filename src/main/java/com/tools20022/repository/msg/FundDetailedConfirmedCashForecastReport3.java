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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportCancellationV03;
import com.tools20022.repository.entity.FundsCashFlow;
import com.tools20022.repository.entity.InvestmentFundTransaction;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information about a cash forecast report.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundDetailedConfirmedCashForecastReport3#mmFundOrSubFundDetails
 * FundDetailedConfirmedCashForecastReport3.mmFundOrSubFundDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundDetailedConfirmedCashForecastReport3#mmFundCashForecastDetails
 * FundDetailedConfirmedCashForecastReport3.mmFundCashForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundDetailedConfirmedCashForecastReport3#mmConsolidatedNetCashForecast
 * FundDetailedConfirmedCashForecastReport3.mmConsolidatedNetCashForecast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundDetailedConfirmedCashForecastReport3#mmExtension
 * FundDetailedConfirmedCashForecastReport3.mmExtension}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.FundsCashFlow
 * FundsCashFlow}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportCancellationV03#mmCashForecastReportToBeCancelled
 * FundDetailedConfirmedCashForecastReportCancellationV03.
 * mmCashForecastReportToBeCancelled}</li>
 * </ul>
 * </li>
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
 * "FundDetailedConfirmedCashForecastReport3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about a cash forecast report."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.FundDetailedConfirmedCashForecastReport2
 * FundDetailedConfirmedCashForecastReport2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FundDetailedConfirmedCashForecastReport3", propOrder = {"fundOrSubFundDetails", "fundCashForecastDetails", "consolidatedNetCashForecast", "extension"})
public class FundDetailedConfirmedCashForecastReport3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "FndOrSubFndDtls")
	protected Fund4 fundOrSubFundDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Fund4 Fund4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentFundClass
	 * InvestmentFundTransaction.mmInvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundDetailedConfirmedCashForecastReport3
	 * FundDetailedConfirmedCashForecastReport3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FndOrSubFndDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundOrSubFundDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information about the fund/sub fund when the report either specifies cash flow for the fund/sub fund or for a share class of the fund/sub fund."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFundOrSubFundDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmInvestmentFundClass;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundDetailedConfirmedCashForecastReport3.mmObject();
			isDerived = false;
			xmlTag = "FndOrSubFndDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundOrSubFundDetails";
			definition = "Information about the fund/sub fund when the report either specifies cash flow for the fund/sub fund or for a share class of the fund/sub fund.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Fund4.mmObject();
		}
	};
	@XmlElement(name = "FndCshFcstDtls", required = true)
	protected List<com.tools20022.repository.msg.FundCashForecast6> fundCashForecastDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FundCashForecast6
	 * FundCashForecast6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow FundsCashFlow}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundDetailedConfirmedCashForecastReport3
	 * FundDetailedConfirmedCashForecastReport3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FndCshFcstDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundCashForecastDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the cash-in and cash-out flows for a specific trade date as a result of transactions in shares in an investment fund, for example, subscriptions, redemptions or switches. The information provided is sorted by pre-defined criteria such as country, institution, currency or user defined criteria."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FundDetailedConfirmedCashForecastReport2#mmFundCashForecastDetails
	 * FundDetailedConfirmedCashForecastReport2.mmFundCashForecastDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFundCashForecastDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> FundsCashFlow.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.FundDetailedConfirmedCashForecastReport3.mmObject();
			isDerived = false;
			xmlTag = "FndCshFcstDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundCashForecastDetails";
			definition = "Information related to the cash-in and cash-out flows for a specific trade date as a result of transactions in shares in an investment fund, for example, subscriptions, redemptions or switches. The information provided is sorted by pre-defined criteria such as country, institution, currency or user defined criteria.";
			previousVersion_lazy = () -> FundDetailedConfirmedCashForecastReport2.mmFundCashForecastDetails;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FundCashForecast6.mmObject();
		}
	};
	@XmlElement(name = "CnsltdNetCshFcst")
	protected NetCashForecast3 consolidatedNetCashForecast;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NetCashForecast3
	 * NetCashForecast3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow FundsCashFlow}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundDetailedConfirmedCashForecastReport3
	 * FundDetailedConfirmedCashForecastReport3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CnsltdNetCshFcst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsolidatedNetCashForecast"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Estimated net cash as a result of the cash-in and cash-out flows."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FundDetailedConfirmedCashForecastReport2#mmConsolidatedNetCashForecast
	 * FundDetailedConfirmedCashForecastReport2.mmConsolidatedNetCashForecast}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmConsolidatedNetCashForecast = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> FundsCashFlow.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.FundDetailedConfirmedCashForecastReport3.mmObject();
			isDerived = false;
			xmlTag = "CnsltdNetCshFcst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConsolidatedNetCashForecast";
			definition = "Estimated net cash as a result of the cash-in and cash-out flows.";
			previousVersion_lazy = () -> FundDetailedConfirmedCashForecastReport2.mmConsolidatedNetCashForecast;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.NetCashForecast3.mmObject();
		}
	};
	@XmlElement(name = "Xtnsn")
	protected List<com.tools20022.repository.msg.Extension1> extension;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Extension1 Extension1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundDetailedConfirmedCashForecastReport3
	 * FundDetailedConfirmedCashForecastReport3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Xtnsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Extension"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FundDetailedConfirmedCashForecastReport2#mmExtension
	 * FundDetailedConfirmedCashForecastReport2.mmExtension}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmExtension = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FundDetailedConfirmedCashForecastReport3.mmObject();
			isDerived = false;
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			previousVersion_lazy = () -> FundDetailedConfirmedCashForecastReport2.mmExtension;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Extension1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FundDetailedConfirmedCashForecastReport3.mmFundOrSubFundDetails,
						com.tools20022.repository.msg.FundDetailedConfirmedCashForecastReport3.mmFundCashForecastDetails, com.tools20022.repository.msg.FundDetailedConfirmedCashForecastReport3.mmConsolidatedNetCashForecast,
						com.tools20022.repository.msg.FundDetailedConfirmedCashForecastReport3.mmExtension);
				messageBuildingBlock_lazy = () -> Arrays.asList(FundDetailedConfirmedCashForecastReportCancellationV03.mmCashForecastReportToBeCancelled);
				trace_lazy = () -> FundsCashFlow.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FundDetailedConfirmedCashForecastReport3";
				definition = "Information about a cash forecast report.";
				previousVersion_lazy = () -> FundDetailedConfirmedCashForecastReport2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Fund4> getFundOrSubFundDetails() {
		return fundOrSubFundDetails == null ? Optional.empty() : Optional.of(fundOrSubFundDetails);
	}

	public FundDetailedConfirmedCashForecastReport3 setFundOrSubFundDetails(com.tools20022.repository.msg.Fund4 fundOrSubFundDetails) {
		this.fundOrSubFundDetails = fundOrSubFundDetails;
		return this;
	}

	public List<FundCashForecast6> getFundCashForecastDetails() {
		return fundCashForecastDetails == null ? fundCashForecastDetails = new ArrayList<>() : fundCashForecastDetails;
	}

	public FundDetailedConfirmedCashForecastReport3 setFundCashForecastDetails(List<com.tools20022.repository.msg.FundCashForecast6> fundCashForecastDetails) {
		this.fundCashForecastDetails = Objects.requireNonNull(fundCashForecastDetails);
		return this;
	}

	public Optional<NetCashForecast3> getConsolidatedNetCashForecast() {
		return consolidatedNetCashForecast == null ? Optional.empty() : Optional.of(consolidatedNetCashForecast);
	}

	public FundDetailedConfirmedCashForecastReport3 setConsolidatedNetCashForecast(com.tools20022.repository.msg.NetCashForecast3 consolidatedNetCashForecast) {
		this.consolidatedNetCashForecast = consolidatedNetCashForecast;
		return this;
	}

	public List<Extension1> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public FundDetailedConfirmedCashForecastReport3 setExtension(List<com.tools20022.repository.msg.Extension1> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}
}