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
import com.tools20022.repository.msg.CashAccount22;
import com.tools20022.repository.msg.ContactAttributes1;
import com.tools20022.repository.msg.ProcessingCharacteristics2;
import com.tools20022.repository.msg.ProcessingCharacteristics3;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "LocalMarketAnnex2", propOrder = {"country", "localOrderDesk", "subscriptionProcessingCharacteristics", "redemptionProcessingCharacteristics", "settlementDetails"})
public class LocalMarketAnnex2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Ctry", required = true)
	protected List<CountryCode> country;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<LocalMarketAnnex2, List<CountryCode>> mmCountry = new MMMessageAttribute<LocalMarketAnnex2, List<CountryCode>>() {
		{
			businessElementTrace_lazy = () -> Country.mmCode;
			componentContext_lazy = () -> com.tools20022.repository.msg.LocalMarketAnnex2.mmObject();
			isDerived = false;
			xmlTag = "Ctry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Country";
			definition = "Country in which the processing characteristic applies.";
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public List<CountryCode> getValue(LocalMarketAnnex2 obj) {
			return obj.getCountry();
		}

		@Override
		public void setValue(LocalMarketAnnex2 obj, List<CountryCode> value) {
			obj.setCountry(value);
		}
	};
	@XmlElement(name = "LclOrdrDsk", required = true)
	protected ContactAttributes1 localOrderDesk;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<LocalMarketAnnex2, ContactAttributes1> mmLocalOrderDesk = new MMMessageAssociationEnd<LocalMarketAnnex2, ContactAttributes1>() {
		{
			businessElementTrace_lazy = () -> Party.mmContactPoint;
			componentContext_lazy = () -> com.tools20022.repository.msg.LocalMarketAnnex2.mmObject();
			isDerived = false;
			xmlTag = "LclOrdrDsk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalOrderDesk";
			definition = "Organisation established primarily to provide financial services.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ContactAttributes1.mmObject();
		}

		@Override
		public ContactAttributes1 getValue(LocalMarketAnnex2 obj) {
			return obj.getLocalOrderDesk();
		}

		@Override
		public void setValue(LocalMarketAnnex2 obj, ContactAttributes1 value) {
			obj.setLocalOrderDesk(value);
		}
	};
	@XmlElement(name = "SbcptPrcgChrtcs", required = true)
	protected ProcessingCharacteristics2 subscriptionProcessingCharacteristics;
	/**
	 * 
	 <p>
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
	 * "Processing characteristics linked to the instrument, ie, not to the market."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LocalMarketAnnex2, ProcessingCharacteristics2> mmSubscriptionProcessingCharacteristics = new MMMessageAssociationEnd<LocalMarketAnnex2, ProcessingCharacteristics2>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmProcessingCharacteristics;
			componentContext_lazy = () -> com.tools20022.repository.msg.LocalMarketAnnex2.mmObject();
			isDerived = false;
			xmlTag = "SbcptPrcgChrtcs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriptionProcessingCharacteristics";
			definition = "Processing characteristics linked to the instrument, ie, not to the market.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProcessingCharacteristics2.mmObject();
		}

		@Override
		public ProcessingCharacteristics2 getValue(LocalMarketAnnex2 obj) {
			return obj.getSubscriptionProcessingCharacteristics();
		}

		@Override
		public void setValue(LocalMarketAnnex2 obj, ProcessingCharacteristics2 value) {
			obj.setSubscriptionProcessingCharacteristics(value);
		}
	};
	@XmlElement(name = "RedPrcgChrtcs", required = true)
	protected ProcessingCharacteristics3 redemptionProcessingCharacteristics;
	/**
	 * 
	 <p>
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
	 * "Processing characteristics linked to the instrument, ie, not to the market."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LocalMarketAnnex2, ProcessingCharacteristics3> mmRedemptionProcessingCharacteristics = new MMMessageAssociationEnd<LocalMarketAnnex2, ProcessingCharacteristics3>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmProcessingCharacteristics;
			componentContext_lazy = () -> com.tools20022.repository.msg.LocalMarketAnnex2.mmObject();
			isDerived = false;
			xmlTag = "RedPrcgChrtcs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionProcessingCharacteristics";
			definition = "Processing characteristics linked to the instrument, ie, not to the market.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProcessingCharacteristics3.mmObject();
		}

		@Override
		public ProcessingCharacteristics3 getValue(LocalMarketAnnex2 obj) {
			return obj.getRedemptionProcessingCharacteristics();
		}

		@Override
		public void setValue(LocalMarketAnnex2 obj, ProcessingCharacteristics3 value) {
			obj.setRedemptionProcessingCharacteristics(value);
		}
	};
	@XmlElement(name = "SttlmDtls", required = true)
	protected List<CashAccount22> settlementDetails;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<LocalMarketAnnex2, List<CashAccount22>> mmSettlementDetails = new MMMessageAssociationEnd<LocalMarketAnnex2, List<CashAccount22>>() {
		{
			businessElementTrace_lazy = () -> CashSettlement.mmSettlementAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.LocalMarketAnnex2.mmObject();
			isDerived = false;
			xmlTag = "SttlmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetails";
			definition = "Account to or from which a cash entry is made.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CashAccount22.mmObject();
		}

		@Override
		public List<CashAccount22> getValue(LocalMarketAnnex2 obj) {
			return obj.getSettlementDetails();
		}

		@Override
		public void setValue(LocalMarketAnnex2 obj, List<CashAccount22> value) {
			obj.setSettlementDetails(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LocalMarketAnnex2.mmCountry, com.tools20022.repository.msg.LocalMarketAnnex2.mmLocalOrderDesk,
						com.tools20022.repository.msg.LocalMarketAnnex2.mmSubscriptionProcessingCharacteristics, com.tools20022.repository.msg.LocalMarketAnnex2.mmRedemptionProcessingCharacteristics,
						com.tools20022.repository.msg.LocalMarketAnnex2.mmSettlementDetails);
				trace_lazy = () -> TradingMarket.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LocalMarketAnnex2";
				definition = "Context, or geographic environment, in which trading parties may meet in order to negotiate and execute trades among themselves.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<CountryCode> getCountry() {
		return country == null ? country = new ArrayList<>() : country;
	}

	public LocalMarketAnnex2 setCountry(List<CountryCode> country) {
		this.country = Objects.requireNonNull(country);
		return this;
	}

	public ContactAttributes1 getLocalOrderDesk() {
		return localOrderDesk;
	}

	public LocalMarketAnnex2 setLocalOrderDesk(ContactAttributes1 localOrderDesk) {
		this.localOrderDesk = Objects.requireNonNull(localOrderDesk);
		return this;
	}

	public ProcessingCharacteristics2 getSubscriptionProcessingCharacteristics() {
		return subscriptionProcessingCharacteristics;
	}

	public LocalMarketAnnex2 setSubscriptionProcessingCharacteristics(ProcessingCharacteristics2 subscriptionProcessingCharacteristics) {
		this.subscriptionProcessingCharacteristics = Objects.requireNonNull(subscriptionProcessingCharacteristics);
		return this;
	}

	public ProcessingCharacteristics3 getRedemptionProcessingCharacteristics() {
		return redemptionProcessingCharacteristics;
	}

	public LocalMarketAnnex2 setRedemptionProcessingCharacteristics(ProcessingCharacteristics3 redemptionProcessingCharacteristics) {
		this.redemptionProcessingCharacteristics = Objects.requireNonNull(redemptionProcessingCharacteristics);
		return this;
	}

	public List<CashAccount22> getSettlementDetails() {
		return settlementDetails == null ? settlementDetails = new ArrayList<>() : settlementDetails;
	}

	public LocalMarketAnnex2 setSettlementDetails(List<CashAccount22> settlementDetails) {
		this.settlementDetails = Objects.requireNonNull(settlementDetails);
		return this;
	}
}