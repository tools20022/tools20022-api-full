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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateActionPeriod2", propOrder = {"assentedLinePeriod", "actionPeriod", "privilegeSuspensionPeriod", "parallelTradingPeriod", "sellThruIssuerPeriod", "revocabilityPeriod", "priceCalculationPeriod"})
public class CorporateActionPeriod2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Period1 assentedLinePeriod;
	/**
	 * Period during which the assented line is available.
	 * <p>
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
	public static final MMMessageAttribute mmAssentedLinePeriod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmAssentedLinePeriod;
			componentContext_lazy = () -> CorporateActionPeriod2.mmObject();
			isDerived = false;
			xmlTag = "AssntdLinePrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssentedLinePeriod";
			definition = "Period during which the assented line is available.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Period1.mmObject();
		}
	};
	protected Period1 actionPeriod;
	/**
	 * Period during which the specified option, or all options of the event,
	 * remains valid, eg, offer period.
	 * <p>
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
	public static final MMMessageAttribute mmActionPeriod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmActionPeriod;
			componentContext_lazy = () -> CorporateActionPeriod2.mmObject();
			isDerived = false;
			xmlTag = "ActnPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActionPeriod";
			definition = "Period during which the specified option, or all options of the event, remains valid, eg, offer period.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Period1.mmObject();
		}
	};
	protected Period1 privilegeSuspensionPeriod;
	/**
	 * Period during which the privilege is not available, eg, this can happen
	 * whenever a meeting takes place or whenever a coupon payment is due.
	 * <p>
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
	public static final MMMessageAttribute mmPrivilegeSuspensionPeriod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SuspensionPeriod.mmPrivilegeSuspensionPeriod;
			componentContext_lazy = () -> CorporateActionPeriod2.mmObject();
			isDerived = false;
			xmlTag = "PrvlgSspnsnPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrivilegeSuspensionPeriod";
			definition = "Period during which the privilege is not available, eg, this can happen whenever a meeting takes place or whenever a coupon payment is due.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Period1.mmObject();
		}
	};
	protected Period1 parallelTradingPeriod;
	/**
	 * Period during which both old and new equity may be traded simultaneously,
	 * eg, consolidation of equity or splitting of equity.
	 * <p>
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
	public static final MMMessageAttribute mmParallelTradingPeriod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmParallelTradingPeriod;
			componentContext_lazy = () -> CorporateActionPeriod2.mmObject();
			isDerived = false;
			xmlTag = "ParllTradgPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParallelTradingPeriod";
			definition = "Period during which both old and new equity may be traded simultaneously, eg, consolidation of equity or splitting of equity.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Period1.mmObject();
		}
	};
	protected Period1 sellThruIssuerPeriod;
	/**
	 * Period (last day included) during which an account owner can surrender or
	 * sell securities to the issuer and receive the sale proceeds.
	 * <p>
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
	public static final MMMessageAttribute mmSellThruIssuerPeriod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmSellThruIssuerPeriod;
			componentContext_lazy = () -> CorporateActionPeriod2.mmObject();
			isDerived = false;
			xmlTag = "SellThruIssrPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellThruIssuerPeriod";
			definition = "Period (last day included) during which an account owner can surrender or sell securities to the issuer and receive the sale proceeds.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Period1.mmObject();
		}
	};
	protected Period1 revocabilityPeriod;
	/**
	 * Period during which the shareholder can revoke, change or withdraw its
	 * instruction.
	 * <p>
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
	public static final MMMessageAttribute mmRevocabilityPeriod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmRevocabilityPeriod;
			componentContext_lazy = () -> CorporateActionPeriod2.mmObject();
			isDerived = false;
			xmlTag = "RvcbltyPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RevocabilityPeriod";
			definition = "Period during which the shareholder can revoke, change or withdraw its instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Period1.mmObject();
		}
	};
	protected Period1 priceCalculationPeriod;
	/**
	 * Period during which the price of a security is determined (for outturn
	 * securities).
	 * <p>
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
	 * "Period during which the price of a security is determined (for  outturn securities)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPriceCalculationPeriod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPriceCalculationPeriod;
			componentContext_lazy = () -> CorporateActionPeriod2.mmObject();
			isDerived = false;
			xmlTag = "PricClctnPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceCalculationPeriod";
			definition = "Period during which the price of a security is determined (for  outturn securities).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Period1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionPeriod2.mmAssentedLinePeriod, CorporateActionPeriod2.mmActionPeriod, CorporateActionPeriod2.mmPrivilegeSuspensionPeriod,
						CorporateActionPeriod2.mmParallelTradingPeriod, CorporateActionPeriod2.mmSellThruIssuerPeriod, CorporateActionPeriod2.mmRevocabilityPeriod, CorporateActionPeriod2.mmPriceCalculationPeriod);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionPeriod2";
				definition = "Specifies periods.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "AssntdLinePrd")
	public Period1 getAssentedLinePeriod() {
		return assentedLinePeriod;
	}

	public void setAssentedLinePeriod(com.tools20022.repository.msg.Period1 assentedLinePeriod) {
		this.assentedLinePeriod = assentedLinePeriod;
	}

	@XmlElement(name = "ActnPrd")
	public Period1 getActionPeriod() {
		return actionPeriod;
	}

	public void setActionPeriod(com.tools20022.repository.msg.Period1 actionPeriod) {
		this.actionPeriod = actionPeriod;
	}

	@XmlElement(name = "PrvlgSspnsnPrd")
	public Period1 getPrivilegeSuspensionPeriod() {
		return privilegeSuspensionPeriod;
	}

	public void setPrivilegeSuspensionPeriod(com.tools20022.repository.msg.Period1 privilegeSuspensionPeriod) {
		this.privilegeSuspensionPeriod = privilegeSuspensionPeriod;
	}

	@XmlElement(name = "ParllTradgPrd")
	public Period1 getParallelTradingPeriod() {
		return parallelTradingPeriod;
	}

	public void setParallelTradingPeriod(com.tools20022.repository.msg.Period1 parallelTradingPeriod) {
		this.parallelTradingPeriod = parallelTradingPeriod;
	}

	@XmlElement(name = "SellThruIssrPrd")
	public Period1 getSellThruIssuerPeriod() {
		return sellThruIssuerPeriod;
	}

	public void setSellThruIssuerPeriod(com.tools20022.repository.msg.Period1 sellThruIssuerPeriod) {
		this.sellThruIssuerPeriod = sellThruIssuerPeriod;
	}

	@XmlElement(name = "RvcbltyPrd")
	public Period1 getRevocabilityPeriod() {
		return revocabilityPeriod;
	}

	public void setRevocabilityPeriod(com.tools20022.repository.msg.Period1 revocabilityPeriod) {
		this.revocabilityPeriod = revocabilityPeriod;
	}

	@XmlElement(name = "PricClctnPrd")
	public Period1 getPriceCalculationPeriod() {
		return priceCalculationPeriod;
	}

	public void setPriceCalculationPeriod(com.tools20022.repository.msg.Period1 priceCalculationPeriod) {
		this.priceCalculationPeriod = priceCalculationPeriod;
	}
}