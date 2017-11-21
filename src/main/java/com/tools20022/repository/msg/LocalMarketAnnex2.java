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
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Context, or geographic environment, in which trading parties may meet in
 * order to negotiate and execute trades among themselves.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.LocalMarketAnnex2#mmCountry
 * LocalMarketAnnex2.mmCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LocalMarketAnnex2#mmLocalOrderDesk
 * LocalMarketAnnex2.mmLocalOrderDesk}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LocalMarketAnnex2#mmSubscriptionProcessingCharacteristics
 * LocalMarketAnnex2.mmSubscriptionProcessingCharacteristics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LocalMarketAnnex2#mmRedemptionProcessingCharacteristics
 * LocalMarketAnnex2.mmRedemptionProcessingCharacteristics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LocalMarketAnnex2#mmSettlementDetails
 * LocalMarketAnnex2.mmSettlementDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.TradingMarket
 * TradingMarket}</li>
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
 * "LocalMarketAnnex2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Context, or geographic environment, in which trading parties may meet in order to negotiate and execute trades among themselves."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "LocalMarketAnnex2", propOrder = {"country", "localOrderDesk", "subscriptionProcessingCharacteristics", "redemptionProcessingCharacteristics", "settlementDetails"})
public class LocalMarketAnnex2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<CountryCode> country;
	/**
	 * Country in which the processing characteristic applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Country#mmCode
	 * Country.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LocalMarketAnnex2
	 * LocalMarketAnnex2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ctry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Country"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country in which the processing characteristic applies."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCountry = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Country.mmCode;
			componentContext_lazy = () -> LocalMarketAnnex2.mmObject();
			isDerived = false;
			xmlTag = "Ctry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Country";
			definition = "Country in which the processing characteristic applies.";
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	protected ContactAttributes1 localOrderDesk;
	/**
	 * Organisation established primarily to provide financial services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ContactAttributes1
	 * ContactAttributes1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmContactPoint
	 * Party.mmContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LocalMarketAnnex2
	 * LocalMarketAnnex2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LclOrdrDsk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocalOrderDesk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Organisation established primarily to provide financial services."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLocalOrderDesk = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmContactPoint;
			componentContext_lazy = () -> LocalMarketAnnex2.mmObject();
			isDerived = false;
			xmlTag = "LclOrdrDsk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalOrderDesk";
			definition = "Organisation established primarily to provide financial services.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ContactAttributes1.mmObject();
		}
	};
	protected ProcessingCharacteristics2 subscriptionProcessingCharacteristics;
	/**
	 * Processing characteristics linked to the instrument, ie, not to the
	 * market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics2
	 * ProcessingCharacteristics2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmProcessingCharacteristics
	 * InvestmentFundClass.mmProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LocalMarketAnnex2
	 * LocalMarketAnnex2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SbcptPrcgChrtcs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionProcessingCharacteristics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Processing characteristics linked to the instrument, ie, not to  the market."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSubscriptionProcessingCharacteristics = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmProcessingCharacteristics;
			componentContext_lazy = () -> LocalMarketAnnex2.mmObject();
			isDerived = false;
			xmlTag = "SbcptPrcgChrtcs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriptionProcessingCharacteristics";
			definition = "Processing characteristics linked to the instrument, ie, not to  the market.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ProcessingCharacteristics2.mmObject();
		}
	};
	protected ProcessingCharacteristics3 redemptionProcessingCharacteristics;
	/**
	 * Processing characteristics linked to the instrument, ie, not to the
	 * market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics3
	 * ProcessingCharacteristics3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmProcessingCharacteristics
	 * InvestmentFundClass.mmProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LocalMarketAnnex2
	 * LocalMarketAnnex2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RedPrcgChrtcs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionProcessingCharacteristics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Processing characteristics linked to the instrument, ie, not to  the market."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRedemptionProcessingCharacteristics = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmProcessingCharacteristics;
			componentContext_lazy = () -> LocalMarketAnnex2.mmObject();
			isDerived = false;
			xmlTag = "RedPrcgChrtcs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionProcessingCharacteristics";
			definition = "Processing characteristics linked to the instrument, ie, not to  the market.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ProcessingCharacteristics3.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CashAccount22> settlementDetails;
	/**
	 * Account to or from which a cash entry is made.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount22
	 * CashAccount22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmSettlementAccount
	 * CashSettlement.mmSettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LocalMarketAnnex2
	 * LocalMarketAnnex2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to or from which a cash entry is made."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CashSettlement.mmSettlementAccount;
			componentContext_lazy = () -> LocalMarketAnnex2.mmObject();
			isDerived = false;
			xmlTag = "SttlmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetails";
			definition = "Account to or from which a cash entry is made.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount22.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(LocalMarketAnnex2.mmCountry, LocalMarketAnnex2.mmLocalOrderDesk, LocalMarketAnnex2.mmSubscriptionProcessingCharacteristics, LocalMarketAnnex2.mmRedemptionProcessingCharacteristics,
						LocalMarketAnnex2.mmSettlementDetails);
				trace_lazy = () -> TradingMarket.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LocalMarketAnnex2";
				definition = "Context, or geographic environment, in which trading parties may meet in order to negotiate and execute trades among themselves.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Ctry", required = true)
	public List<CountryCode> getCountry() {
		return country;
	}

	public void setCountry(List<CountryCode> country) {
		this.country = country;
	}

	@XmlElement(name = "LclOrdrDsk", required = true)
	public ContactAttributes1 getLocalOrderDesk() {
		return localOrderDesk;
	}

	public void setLocalOrderDesk(com.tools20022.repository.msg.ContactAttributes1 localOrderDesk) {
		this.localOrderDesk = localOrderDesk;
	}

	@XmlElement(name = "SbcptPrcgChrtcs", required = true)
	public ProcessingCharacteristics2 getSubscriptionProcessingCharacteristics() {
		return subscriptionProcessingCharacteristics;
	}

	public void setSubscriptionProcessingCharacteristics(com.tools20022.repository.msg.ProcessingCharacteristics2 subscriptionProcessingCharacteristics) {
		this.subscriptionProcessingCharacteristics = subscriptionProcessingCharacteristics;
	}

	@XmlElement(name = "RedPrcgChrtcs", required = true)
	public ProcessingCharacteristics3 getRedemptionProcessingCharacteristics() {
		return redemptionProcessingCharacteristics;
	}

	public void setRedemptionProcessingCharacteristics(com.tools20022.repository.msg.ProcessingCharacteristics3 redemptionProcessingCharacteristics) {
		this.redemptionProcessingCharacteristics = redemptionProcessingCharacteristics;
	}

	@XmlElement(name = "SttlmDtls", required = true)
	public List<CashAccount22> getSettlementDetails() {
		return settlementDetails;
	}

	public void setSettlementDetails(List<com.tools20022.repository.msg.CashAccount22> settlementDetails) {
		this.settlementDetails = settlementDetails;
	}
}