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
import com.tools20022.repository.choice.BalanceType6Choice;
import com.tools20022.repository.codeset.Unrealised1Code;
import com.tools20022.repository.entity.Balance;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Balance related details for a portfolio.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.BalanceDetails5#Type
 * BalanceDetails5.Type}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BalanceDetails5#Unrealised
 * BalanceDetails5.Unrealised}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BalanceDetails5#Amount
 * BalanceDetails5.Amount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BalanceDetails5#DetailedBalance
 * BalanceDetails5.DetailedBalance}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Balance Balance}</li>
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
 * "BalanceDetails5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Balance related details for a portfolio."</li>
 * </ul>
 */
public class BalanceDetails5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Balance type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceType6Choice
	 * BalanceType6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Balance#Type Balance.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BalanceDetails5
	 * BalanceDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance type."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Type = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BalanceDetails5.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Balance.Type;
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Balance type.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> BalanceType6Choice.mmObject();
		}
	};
	/**
	 * Unrealised gain or loss.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Unrealised1Code
	 * Unrealised1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#UnrealisedType
	 * AssetHolding.UnrealisedType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BalanceDetails5
	 * BalanceDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Urlsd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unrealised"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrealised gain or loss."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Unrealised = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BalanceDetails5.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.AssetHolding.UnrealisedType;
			isDerived = false;
			xmlTag = "Urlsd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unrealised";
			definition = "Unrealised gain or loss.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Unrealised1Code.mmObject();
		}
	};
	/**
	 * Balance amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection31
	 * AmountAndDirection31}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance#Amount
	 * CashBalance.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BalanceDetails5
	 * BalanceDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance amount."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Amount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BalanceDetails5.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashBalance.Amount;
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Balance amount.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> AmountAndDirection31.mmObject();
		}
	};
	/**
	 * Detailed balance information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BalanceDetails6
	 * BalanceDetails6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Balance Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BalanceDetails5
	 * BalanceDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtldBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DetailedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Detailed balance information."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd DetailedBalance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BalanceDetails5.mmObject();
			businessComponentTrace_lazy = () -> Balance.mmObject();
			isDerived = false;
			xmlTag = "DtldBal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DetailedBalance";
			definition = "Detailed balance information.";
			minOccurs = 0;
			type_lazy = () -> BalanceDetails6.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BalanceDetails5.Type, com.tools20022.repository.msg.BalanceDetails5.Unrealised, com.tools20022.repository.msg.BalanceDetails5.Amount,
						com.tools20022.repository.msg.BalanceDetails5.DetailedBalance);
				trace_lazy = () -> Balance.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BalanceDetails5";
				definition = "Balance related details for a portfolio.";
			}
		});
		return mmObject_lazy.get();
	}
}