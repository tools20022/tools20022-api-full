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
import com.tools20022.repository.choice.DerivativePartyIdentification1Choice;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.CreditDefaultSwap;
import com.tools20022.repository.entity.Derivative;
import com.tools20022.repository.entity.RegistrarRole;
import com.tools20022.repository.entity.Swaps;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Credit default swap derivative specific for reporting on a single name credit
 * default swap.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapSingleName2#mmSovereignIssuer
 * CreditDefaultSwapSingleName2.mmSovereignIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapSingleName2#mmReferenceParty
 * CreditDefaultSwapSingleName2.mmReferenceParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapSingleName2#mmNotionalCurrency
 * CreditDefaultSwapSingleName2.mmNotionalCurrency}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CreditDefaultSwap
 * CreditDefaultSwap}</li>
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
 * "CreditDefaultSwapSingleName2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Credit default swap derivative specific for reporting on a single name credit default swap."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CreditDefaultSwapSingleName2", propOrder = {"sovereignIssuer", "referenceParty", "notionalCurrency"})
public class CreditDefaultSwapSingleName2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected TrueFalseIndicator sovereignIssuer;
	/**
	 * Reference entity of a single name credit default swap (CDS) or a
	 * derivative on single name CDS.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Swaps#mmSovereignIssuer
	 * Swaps.mmSovereignIssuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapSingleName2
	 * CreditDefaultSwapSingleName2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvrgnIssr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SovereignIssuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference entity of a single name credit default swap (CDS) or a derivative on single name CDS."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSovereignIssuer = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Swaps.mmSovereignIssuer;
			componentContext_lazy = () -> CreditDefaultSwapSingleName2.mmObject();
			isDerived = false;
			xmlTag = "SvrgnIssr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SovereignIssuer";
			definition = "Reference entity of a single name credit default swap (CDS) or a derivative on single name CDS.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected DerivativePartyIdentification1Choice referenceParty;
	/**
	 * Reference entity of a single name credit default swap (CDS) or a
	 * derivative on single name credit default swap (CDS).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DerivativePartyIdentification1Choice
	 * DerivativePartyIdentification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.RegistrarRole RegistrarRole}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapSingleName2
	 * CreditDefaultSwapSingleName2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RefPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference entity of a single name credit default swap (CDS) or a derivative on single name credit default swap (CDS)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReferenceParty = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> RegistrarRole.mmObject();
			componentContext_lazy = () -> CreditDefaultSwapSingleName2.mmObject();
			isDerived = false;
			xmlTag = "RefPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceParty";
			definition = "Reference entity of a single name credit default swap (CDS) or a derivative on single name credit default swap (CDS).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DerivativePartyIdentification1Choice.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyCode notionalCurrency;
	/**
	 * Currency in which the notional is denominated.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Derivative#mmNotionalCurrency
	 * Derivative.mmNotionalCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapSingleName2
	 * CreditDefaultSwapSingleName2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtnlCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotionalCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency in which the notional is denominated.\r\n"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNotionalCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Derivative.mmNotionalCurrency;
			componentContext_lazy = () -> CreditDefaultSwapSingleName2.mmObject();
			isDerived = false;
			xmlTag = "NtnlCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotionalCurrency";
			definition = "Currency in which the notional is denominated.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CreditDefaultSwapSingleName2.mmSovereignIssuer, CreditDefaultSwapSingleName2.mmReferenceParty, CreditDefaultSwapSingleName2.mmNotionalCurrency);
				trace_lazy = () -> CreditDefaultSwap.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CreditDefaultSwapSingleName2";
				definition = "Credit default swap derivative specific for reporting on a single name credit default swap.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "SvrgnIssr", required = true)
	public TrueFalseIndicator getSovereignIssuer() {
		return sovereignIssuer;
	}

	public void setSovereignIssuer(TrueFalseIndicator sovereignIssuer) {
		this.sovereignIssuer = sovereignIssuer;
	}

	@XmlElement(name = "RefPty")
	public DerivativePartyIdentification1Choice getReferenceParty() {
		return referenceParty;
	}

	public void setReferenceParty(DerivativePartyIdentification1Choice referenceParty) {
		this.referenceParty = referenceParty;
	}

	@XmlElement(name = "NtnlCcy", required = true)
	public ActiveOrHistoricCurrencyCode getNotionalCurrency() {
		return notionalCurrency;
	}

	public void setNotionalCurrency(ActiveOrHistoricCurrencyCode notionalCurrency) {
		this.notionalCurrency = notionalCurrency;
	}
}