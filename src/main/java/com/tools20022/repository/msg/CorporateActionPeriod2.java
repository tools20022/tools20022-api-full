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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Period1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies periods.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod2#mmAssentedLinePeriod
 * CorporateActionPeriod2.mmAssentedLinePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod2#mmActionPeriod
 * CorporateActionPeriod2.mmActionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod2#mmPrivilegeSuspensionPeriod
 * CorporateActionPeriod2.mmPrivilegeSuspensionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod2#mmParallelTradingPeriod
 * CorporateActionPeriod2.mmParallelTradingPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod2#mmSellThruIssuerPeriod
 * CorporateActionPeriod2.mmSellThruIssuerPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod2#mmRevocabilityPeriod
 * CorporateActionPeriod2.mmRevocabilityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod2#mmPriceCalculationPeriod
 * CorporateActionPeriod2.mmPriceCalculationPeriod}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionEvent
 * CorporateActionEvent}</li>
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
 * "CorporateActionPeriod2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies periods."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionPeriod2", propOrder = {"assentedLinePeriod", "actionPeriod", "privilegeSuspensionPeriod", "parallelTradingPeriod", "sellThruIssuerPeriod", "revocabilityPeriod", "priceCalculationPeriod"})
public class CorporateActionPeriod2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AssntdLinePrd")
	protected Period1 assentedLinePeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Period1 Period1}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmAssentedLinePeriod
	 * SecuritiesProceedsDefinition.mmAssentedLinePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod2
	 * CorporateActionPeriod2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AssntdLinePrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssentedLinePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period during which the assented line is available."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionPeriod2, Optional<Period1>> mmAssentedLinePeriod = new MMMessageAttribute<CorporateActionPeriod2, Optional<Period1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmAssentedLinePeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod2.mmObject();
			isDerived = false;
			xmlTag = "AssntdLinePrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssentedLinePeriod";
			definition = "Period during which the assented line is available.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Period1.mmObject();
		}

		@Override
		public Optional<Period1> getValue(CorporateActionPeriod2 obj) {
			return obj.getAssentedLinePeriod();
		}

		@Override
		public void setValue(CorporateActionPeriod2 obj, Optional<Period1> value) {
			obj.setAssentedLinePeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "ActnPrd")
	protected Period1 actionPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Period1 Period1}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmActionPeriod
	 * CorporateActionOption.mmActionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod2
	 * CorporateActionPeriod2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActnPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActionPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which the specified option, or all options of the event, remains valid, eg, offer period."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionPeriod2, Optional<Period1>> mmActionPeriod = new MMMessageAttribute<CorporateActionPeriod2, Optional<Period1>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmActionPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod2.mmObject();
			isDerived = false;
			xmlTag = "ActnPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActionPeriod";
			definition = "Period during which the specified option, or all options of the event, remains valid, eg, offer period.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Period1.mmObject();
		}

		@Override
		public Optional<Period1> getValue(CorporateActionPeriod2 obj) {
			return obj.getActionPeriod();
		}

		@Override
		public void setValue(CorporateActionPeriod2 obj, Optional<Period1> value) {
			obj.setActionPeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "PrvlgSspnsnPrd")
	protected Period1 privilegeSuspensionPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Period1 Period1}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmPrivilegeSuspensionPeriod
	 * SuspensionPeriod.mmPrivilegeSuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod2
	 * CorporateActionPeriod2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvlgSspnsnPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrivilegeSuspensionPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which the privilege is not available, eg, this can happen whenever a meeting takes place or whenever a coupon payment is due."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionPeriod2, Optional<Period1>> mmPrivilegeSuspensionPeriod = new MMMessageAttribute<CorporateActionPeriod2, Optional<Period1>>() {
		{
			businessElementTrace_lazy = () -> SuspensionPeriod.mmPrivilegeSuspensionPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod2.mmObject();
			isDerived = false;
			xmlTag = "PrvlgSspnsnPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrivilegeSuspensionPeriod";
			definition = "Period during which the privilege is not available, eg, this can happen whenever a meeting takes place or whenever a coupon payment is due.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Period1.mmObject();
		}

		@Override
		public Optional<Period1> getValue(CorporateActionPeriod2 obj) {
			return obj.getPrivilegeSuspensionPeriod();
		}

		@Override
		public void setValue(CorporateActionPeriod2 obj, Optional<Period1> value) {
			obj.setPrivilegeSuspensionPeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "ParllTradgPrd")
	protected Period1 parallelTradingPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Period1 Period1}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmParallelTradingPeriod
	 * SecuritiesProceedsDefinition.mmParallelTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod2
	 * CorporateActionPeriod2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ParllTradgPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParallelTradingPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which both old and new equity may be traded simultaneously, eg, consolidation of equity or splitting of equity."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionPeriod2, Optional<Period1>> mmParallelTradingPeriod = new MMMessageAttribute<CorporateActionPeriod2, Optional<Period1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmParallelTradingPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod2.mmObject();
			isDerived = false;
			xmlTag = "ParllTradgPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParallelTradingPeriod";
			definition = "Period during which both old and new equity may be traded simultaneously, eg, consolidation of equity or splitting of equity.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Period1.mmObject();
		}

		@Override
		public Optional<Period1> getValue(CorporateActionPeriod2 obj) {
			return obj.getParallelTradingPeriod();
		}

		@Override
		public void setValue(CorporateActionPeriod2 obj, Optional<Period1> value) {
			obj.setParallelTradingPeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "SellThruIssrPrd")
	protected Period1 sellThruIssuerPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Period1 Period1}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmSellThruIssuerPeriod
	 * SecuritiesProceedsDefinition.mmSellThruIssuerPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod2
	 * CorporateActionPeriod2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SellThruIssrPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellThruIssuerPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period (last day included) during which an account owner can surrender or sell securities to the issuer and receive the sale proceeds."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionPeriod2, Optional<Period1>> mmSellThruIssuerPeriod = new MMMessageAttribute<CorporateActionPeriod2, Optional<Period1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmSellThruIssuerPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod2.mmObject();
			isDerived = false;
			xmlTag = "SellThruIssrPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellThruIssuerPeriod";
			definition = "Period (last day included) during which an account owner can surrender or sell securities to the issuer and receive the sale proceeds.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Period1.mmObject();
		}

		@Override
		public Optional<Period1> getValue(CorporateActionPeriod2 obj) {
			return obj.getSellThruIssuerPeriod();
		}

		@Override
		public void setValue(CorporateActionPeriod2 obj, Optional<Period1> value) {
			obj.setSellThruIssuerPeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "RvcbltyPrd")
	protected Period1 revocabilityPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Period1 Period1}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmRevocabilityPeriod
	 * CorporateActionDeadline.mmRevocabilityPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod2
	 * CorporateActionPeriod2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RvcbltyPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevocabilityPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which the shareholder can revoke, change or withdraw its instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionPeriod2, Optional<Period1>> mmRevocabilityPeriod = new MMMessageAttribute<CorporateActionPeriod2, Optional<Period1>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmRevocabilityPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod2.mmObject();
			isDerived = false;
			xmlTag = "RvcbltyPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RevocabilityPeriod";
			definition = "Period during which the shareholder can revoke, change or withdraw its instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Period1.mmObject();
		}

		@Override
		public Optional<Period1> getValue(CorporateActionPeriod2 obj) {
			return obj.getRevocabilityPeriod();
		}

		@Override
		public void setValue(CorporateActionPeriod2 obj, Optional<Period1> value) {
			obj.setRevocabilityPeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "PricClctnPrd")
	protected Period1 priceCalculationPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Period1 Period1}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceCalculationPeriod
	 * SecuritiesPricing.mmPriceCalculationPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod2
	 * CorporateActionPeriod2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricClctnPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceCalculationPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which the price of a security is determined (for outturn securities)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionPeriod2, Optional<Period1>> mmPriceCalculationPeriod = new MMMessageAttribute<CorporateActionPeriod2, Optional<Period1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPriceCalculationPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod2.mmObject();
			isDerived = false;
			xmlTag = "PricClctnPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceCalculationPeriod";
			definition = "Period during which the price of a security is determined (for outturn securities).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Period1.mmObject();
		}

		@Override
		public Optional<Period1> getValue(CorporateActionPeriod2 obj) {
			return obj.getPriceCalculationPeriod();
		}

		@Override
		public void setValue(CorporateActionPeriod2 obj, Optional<Period1> value) {
			obj.setPriceCalculationPeriod(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionPeriod2.mmAssentedLinePeriod, com.tools20022.repository.msg.CorporateActionPeriod2.mmActionPeriod,
						com.tools20022.repository.msg.CorporateActionPeriod2.mmPrivilegeSuspensionPeriod, com.tools20022.repository.msg.CorporateActionPeriod2.mmParallelTradingPeriod,
						com.tools20022.repository.msg.CorporateActionPeriod2.mmSellThruIssuerPeriod, com.tools20022.repository.msg.CorporateActionPeriod2.mmRevocabilityPeriod,
						com.tools20022.repository.msg.CorporateActionPeriod2.mmPriceCalculationPeriod);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionPeriod2";
				definition = "Specifies periods.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Period1> getAssentedLinePeriod() {
		return assentedLinePeriod == null ? Optional.empty() : Optional.of(assentedLinePeriod);
	}

	public CorporateActionPeriod2 setAssentedLinePeriod(Period1 assentedLinePeriod) {
		this.assentedLinePeriod = assentedLinePeriod;
		return this;
	}

	public Optional<Period1> getActionPeriod() {
		return actionPeriod == null ? Optional.empty() : Optional.of(actionPeriod);
	}

	public CorporateActionPeriod2 setActionPeriod(Period1 actionPeriod) {
		this.actionPeriod = actionPeriod;
		return this;
	}

	public Optional<Period1> getPrivilegeSuspensionPeriod() {
		return privilegeSuspensionPeriod == null ? Optional.empty() : Optional.of(privilegeSuspensionPeriod);
	}

	public CorporateActionPeriod2 setPrivilegeSuspensionPeriod(Period1 privilegeSuspensionPeriod) {
		this.privilegeSuspensionPeriod = privilegeSuspensionPeriod;
		return this;
	}

	public Optional<Period1> getParallelTradingPeriod() {
		return parallelTradingPeriod == null ? Optional.empty() : Optional.of(parallelTradingPeriod);
	}

	public CorporateActionPeriod2 setParallelTradingPeriod(Period1 parallelTradingPeriod) {
		this.parallelTradingPeriod = parallelTradingPeriod;
		return this;
	}

	public Optional<Period1> getSellThruIssuerPeriod() {
		return sellThruIssuerPeriod == null ? Optional.empty() : Optional.of(sellThruIssuerPeriod);
	}

	public CorporateActionPeriod2 setSellThruIssuerPeriod(Period1 sellThruIssuerPeriod) {
		this.sellThruIssuerPeriod = sellThruIssuerPeriod;
		return this;
	}

	public Optional<Period1> getRevocabilityPeriod() {
		return revocabilityPeriod == null ? Optional.empty() : Optional.of(revocabilityPeriod);
	}

	public CorporateActionPeriod2 setRevocabilityPeriod(Period1 revocabilityPeriod) {
		this.revocabilityPeriod = revocabilityPeriod;
		return this;
	}

	public Optional<Period1> getPriceCalculationPeriod() {
		return priceCalculationPeriod == null ? Optional.empty() : Optional.of(priceCalculationPeriod);
	}

	public CorporateActionPeriod2 setPriceCalculationPeriod(Period1 priceCalculationPeriod) {
		this.priceCalculationPeriod = priceCalculationPeriod;
		return this;
	}
}