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
import com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportCancellationV01;
import com.tools20022.repository.entity.FundsCashFlow;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.msg.FundDetailedConfirmedCashForecastReport1#mmFundCashForecastDetails
 * FundDetailedConfirmedCashForecastReport1.mmFundCashForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundDetailedConfirmedCashForecastReport1#mmExtension
 * FundDetailedConfirmedCashForecastReport1.mmExtension}</li>
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
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportCancellationV01#mmCashForecastReportToBeCancelled
 * FundDetailedConfirmedCashForecastReportCancellationV01.
 * mmCashForecastReportToBeCancelled}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FundDetailedConfirmedCashForecastReport1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about a cash forecast report."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "FundDetailedConfirmedCashForecastReport1", propOrder = {"fundCashForecastDetails", "extension"})
public class FundDetailedConfirmedCashForecastReport1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.msg.FundCashForecast2> fundCashForecastDetails;
	/**
	 * Information related to the cash-in and cash-out flows for a specific
	 * trade date as a result of investment fund transactions, for example,
	 * subscriptions, redemptions or switches to/from a specified investment
	 * fund. The information provided is sorted by pre-defined criteria such as
	 * country, institution, currency or user defined criteria.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FundCashForecast2
	 * FundCashForecast2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow FundsCashFlow}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundDetailedConfirmedCashForecastReport1
	 * FundDetailedConfirmedCashForecastReport1}</li>
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
	 * "Information related to the cash-in and cash-out flows for a specific trade date as a result of investment fund transactions, for example, subscriptions, redemptions or switches to/from a specified investment fund. The information provided is sorted by pre-defined criteria such as country, institution, currency or user defined criteria."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFundCashForecastDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> FundsCashFlow.mmObject();
			componentContext_lazy = () -> FundDetailedConfirmedCashForecastReport1.mmObject();
			isDerived = false;
			xmlTag = "FndCshFcstDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundCashForecastDetails";
			definition = "Information related to the cash-in and cash-out flows for a specific trade date as a result of investment fund transactions, for example, subscriptions, redemptions or switches to/from a specified investment fund. The information provided is sorted by pre-defined criteria such as country, institution, currency or user defined criteria.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FundCashForecast2.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Extension1> extension;
	/**
	 * Additional information that cannot be captured in the structured elements
	 * and/or any other specific block.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Extension1 Extension1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundDetailedConfirmedCashForecastReport1
	 * FundDetailedConfirmedCashForecastReport1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmExtension = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> FundDetailedConfirmedCashForecastReport1.mmObject();
			isDerived = false;
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Extension1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(FundDetailedConfirmedCashForecastReport1.mmFundCashForecastDetails, FundDetailedConfirmedCashForecastReport1.mmExtension);
				messageBuildingBlock_lazy = () -> Arrays.asList(FundDetailedConfirmedCashForecastReportCancellationV01.mmCashForecastReportToBeCancelled);
				trace_lazy = () -> FundsCashFlow.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FundDetailedConfirmedCashForecastReport1";
				definition = "Information about a cash forecast report.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "FndCshFcstDtls", required = true)
	public List<FundCashForecast2> getFundCashForecastDetails() {
		return fundCashForecastDetails;
	}

	public void setFundCashForecastDetails(List<com.tools20022.repository.msg.FundCashForecast2> fundCashForecastDetails) {
		this.fundCashForecastDetails = fundCashForecastDetails;
	}

	@XmlElement(name = "Xtnsn")
	public List<Extension1> getExtension() {
		return extension;
	}

	public void setExtension(List<com.tools20022.repository.msg.Extension1> extension) {
		this.extension = extension;
	}
}