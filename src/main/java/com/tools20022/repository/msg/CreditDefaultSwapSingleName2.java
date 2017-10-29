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
import com.tools20022.repository.choice.DerivativePartyIdentification1Choice;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.CreditDefaultSwap;
import com.tools20022.repository.entity.RegistrarRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapSingleName2#SovereignIssuer
 * CreditDefaultSwapSingleName2.SovereignIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapSingleName2#ReferenceParty
 * CreditDefaultSwapSingleName2.ReferenceParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapSingleName2#NotionalCurrency
 * CreditDefaultSwapSingleName2.NotionalCurrency}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CreditDefaultSwap
 * CreditDefaultSwap}</li>
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
 * "CreditDefaultSwapSingleName2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Credit default swap derivative specific for reporting on a single name credit default swap."
 * </li>
 * </ul>
 */
public class CreditDefaultSwapSingleName2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	 * {@linkplain com.tools20022.repository.entity.Swaps#SovereignIssuer
	 * Swaps.SovereignIssuer}</li>
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
	public static final MMMessageAttribute SovereignIssuer = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CreditDefaultSwapSingleName2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Swaps.SovereignIssuer;
			isDerived = false;
			xmlTag = "SvrgnIssr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SovereignIssuer";
			definition = "Reference entity of a single name credit default swap (CDS) or a derivative on single name CDS.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
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
	public static final MMMessageAssociationEnd ReferenceParty = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CreditDefaultSwapSingleName2.mmObject();
			businessComponentTrace_lazy = () -> RegistrarRole.mmObject();
			isDerived = false;
			xmlTag = "RefPty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceParty";
			definition = "Reference entity of a single name credit default swap (CDS) or a derivative on single name credit default swap (CDS).";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> DerivativePartyIdentification1Choice.mmObject();
			isComposite = true;
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.Derivative#NotionalCurrency
	 * Derivative.NotionalCurrency}</li>
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
	public static final MMMessageAttribute NotionalCurrency = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CreditDefaultSwapSingleName2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Derivative.NotionalCurrency;
			isDerived = false;
			xmlTag = "NtnlCcy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotionalCurrency";
			definition = "Currency in which the notional is denominated.\r\n";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CreditDefaultSwapSingleName2.SovereignIssuer, com.tools20022.repository.msg.CreditDefaultSwapSingleName2.ReferenceParty,
						com.tools20022.repository.msg.CreditDefaultSwapSingleName2.NotionalCurrency);
				trace_lazy = () -> CreditDefaultSwap.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CreditDefaultSwapSingleName2";
				definition = "Credit default swap derivative specific for reporting on a single name credit default swap.";
			}
		});
		return mmObject_lazy.get();
	}
}