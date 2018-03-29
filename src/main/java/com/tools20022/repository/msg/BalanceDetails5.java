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
import com.tools20022.repository.choice.BalanceType6Choice;
import com.tools20022.repository.codeset.Unrealised1Code;
import com.tools20022.repository.entity.AssetHolding;
import com.tools20022.repository.entity.Balance;
import com.tools20022.repository.entity.CashBalance;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AmountAndDirection31;
import com.tools20022.repository.msg.BalanceDetails6;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Balance related details for a portfolio.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.BalanceDetails5#mmType
 * BalanceDetails5.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BalanceDetails5#mmUnrealised
 * BalanceDetails5.mmUnrealised}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BalanceDetails5#mmAmount
 * BalanceDetails5.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BalanceDetails5#mmDetailedBalance
 * BalanceDetails5.mmDetailedBalance}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Balance Balance}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceTypeGuideline1#forBalanceDetails5
 * ConstraintBalanceTypeGuideline1.forBalanceDetails5}</li>
 * </ul>
 * </li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BalanceDetails5", propOrder = {"type", "unrealised", "amount", "detailedBalance"})
public class BalanceDetails5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Tp", required = true)
	protected BalanceType6Choice type;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.Balance#mmType
	 * Balance.mmType}</li>
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
	public static final MMMessageAttribute<BalanceDetails5, BalanceType6Choice> mmType = new MMMessageAttribute<BalanceDetails5, BalanceType6Choice>() {
		{
			businessElementTrace_lazy = () -> Balance.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.BalanceDetails5.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Balance type.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> BalanceType6Choice.mmObject();
		}

		@Override
		public BalanceType6Choice getValue(BalanceDetails5 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(BalanceDetails5 obj, BalanceType6Choice value) {
			obj.setType(value);
		}
	};
	@XmlElement(name = "Urlsd")
	protected Unrealised1Code unrealised;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmUnrealisedType
	 * AssetHolding.mmUnrealisedType}</li>
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
	public static final MMMessageAttribute<BalanceDetails5, Optional<Unrealised1Code>> mmUnrealised = new MMMessageAttribute<BalanceDetails5, Optional<Unrealised1Code>>() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmUnrealisedType;
			componentContext_lazy = () -> com.tools20022.repository.msg.BalanceDetails5.mmObject();
			isDerived = false;
			xmlTag = "Urlsd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unrealised";
			definition = "Unrealised gain or loss.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Unrealised1Code.mmObject();
		}

		@Override
		public Optional<Unrealised1Code> getValue(BalanceDetails5 obj) {
			return obj.getUnrealised();
		}

		@Override
		public void setValue(BalanceDetails5 obj, Optional<Unrealised1Code> value) {
			obj.setUnrealised(value.orElse(null));
		}
	};
	@XmlElement(name = "Amt", required = true)
	protected AmountAndDirection31 amount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.CashBalance#mmAmount
	 * CashBalance.mmAmount}</li>
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
	public static final MMMessageAttribute<BalanceDetails5, AmountAndDirection31> mmAmount = new MMMessageAttribute<BalanceDetails5, AmountAndDirection31>() {
		{
			businessElementTrace_lazy = () -> CashBalance.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.BalanceDetails5.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Balance amount.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AmountAndDirection31.mmObject();
		}

		@Override
		public AmountAndDirection31 getValue(BalanceDetails5 obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(BalanceDetails5 obj, AmountAndDirection31 value) {
			obj.setAmount(value);
		}
	};
	@XmlElement(name = "DtldBal")
	protected List<BalanceDetails6> detailedBalance;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<BalanceDetails5, List<BalanceDetails6>> mmDetailedBalance = new MMMessageAssociationEnd<BalanceDetails5, List<BalanceDetails6>>() {
		{
			businessComponentTrace_lazy = () -> Balance.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.BalanceDetails5.mmObject();
			isDerived = false;
			xmlTag = "DtldBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DetailedBalance";
			definition = "Detailed balance information.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BalanceDetails6.mmObject();
		}

		@Override
		public List<BalanceDetails6> getValue(BalanceDetails5 obj) {
			return obj.getDetailedBalance();
		}

		@Override
		public void setValue(BalanceDetails5 obj, List<BalanceDetails6> value) {
			obj.setDetailedBalance(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BalanceDetails5.mmType, com.tools20022.repository.msg.BalanceDetails5.mmUnrealised, com.tools20022.repository.msg.BalanceDetails5.mmAmount,
						com.tools20022.repository.msg.BalanceDetails5.mmDetailedBalance);
				trace_lazy = () -> Balance.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintBalanceTypeGuideline1.forBalanceDetails5);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BalanceDetails5";
				definition = "Balance related details for a portfolio.";
			}
		});
		return mmObject_lazy.get();
	}

	public BalanceType6Choice getType() {
		return type;
	}

	public BalanceDetails5 setType(BalanceType6Choice type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public Optional<Unrealised1Code> getUnrealised() {
		return unrealised == null ? Optional.empty() : Optional.of(unrealised);
	}

	public BalanceDetails5 setUnrealised(Unrealised1Code unrealised) {
		this.unrealised = unrealised;
		return this;
	}

	public AmountAndDirection31 getAmount() {
		return amount;
	}

	public BalanceDetails5 setAmount(AmountAndDirection31 amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public List<BalanceDetails6> getDetailedBalance() {
		return detailedBalance == null ? detailedBalance = new ArrayList<>() : detailedBalance;
	}

	public BalanceDetails5 setDetailedBalance(List<BalanceDetails6> detailedBalance) {
		this.detailedBalance = Objects.requireNonNull(detailedBalance);
		return this;
	}
}