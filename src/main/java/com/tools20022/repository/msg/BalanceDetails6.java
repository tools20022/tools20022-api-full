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
import com.tools20022.repository.choice.BalanceType7Choice;
import com.tools20022.repository.codeset.FinancialAssetTypeCategory1Code;
import com.tools20022.repository.codeset.Unrealised1Code;
import com.tools20022.repository.entity.Asset;
import com.tools20022.repository.entity.AssetHolding;
import com.tools20022.repository.entity.Balance;
import com.tools20022.repository.entity.CashBalance;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AmountAndDirection31;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
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
 * <li>{@linkplain com.tools20022.repository.msg.BalanceDetails6#mmCategory
 * BalanceDetails6.mmCategory}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BalanceDetails6#mmType
 * BalanceDetails6.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BalanceDetails6#mmUnrealised
 * BalanceDetails6.mmUnrealised}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BalanceDetails6#mmAmount
 * BalanceDetails6.mmAmount}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceTypeGuideline2#forBalanceDetails6
 * ConstraintBalanceTypeGuideline2.forBalanceDetails6}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BalanceDetails6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Balance related details for a portfolio."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BalanceDetails6", propOrder = {"category", "type", "unrealised", "amount"})
public class BalanceDetails6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Ctgy")
	protected FinancialAssetTypeCategory1Code category;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetTypeCategory1Code
	 * FinancialAssetTypeCategory1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmFinancialAssetCategory
	 * Asset.mmFinancialAssetCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BalanceDetails6
	 * BalanceDetails6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ctgy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Category"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Category of the financial asset balance type."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BalanceDetails6, Optional<FinancialAssetTypeCategory1Code>> mmCategory = new MMMessageAttribute<BalanceDetails6, Optional<FinancialAssetTypeCategory1Code>>() {
		{
			businessElementTrace_lazy = () -> Asset.mmFinancialAssetCategory;
			componentContext_lazy = () -> com.tools20022.repository.msg.BalanceDetails6.mmObject();
			isDerived = false;
			xmlTag = "Ctgy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Category";
			definition = "Category of the financial asset balance type.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> FinancialAssetTypeCategory1Code.mmObject();
		}

		@Override
		public Optional<FinancialAssetTypeCategory1Code> getValue(BalanceDetails6 obj) {
			return obj.getCategory();
		}

		@Override
		public void setValue(BalanceDetails6 obj, Optional<FinancialAssetTypeCategory1Code> value) {
			obj.setCategory(value.orElse(null));
		}
	};
	@XmlElement(name = "Tp")
	protected BalanceType7Choice type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceType7Choice
	 * BalanceType7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Balance#mmType
	 * Balance.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BalanceDetails6
	 * BalanceDetails6}</li>
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
	public static final MMMessageAttribute<BalanceDetails6, Optional<BalanceType7Choice>> mmType = new MMMessageAttribute<BalanceDetails6, Optional<BalanceType7Choice>>() {
		{
			businessElementTrace_lazy = () -> Balance.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.BalanceDetails6.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Balance type.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceType7Choice.mmObject();
		}

		@Override
		public Optional<BalanceType7Choice> getValue(BalanceDetails6 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(BalanceDetails6 obj, Optional<BalanceType7Choice> value) {
			obj.setType(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.BalanceDetails6
	 * BalanceDetails6}</li>
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
	public static final MMMessageAttribute<BalanceDetails6, Optional<Unrealised1Code>> mmUnrealised = new MMMessageAttribute<BalanceDetails6, Optional<Unrealised1Code>>() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmUnrealisedType;
			componentContext_lazy = () -> com.tools20022.repository.msg.BalanceDetails6.mmObject();
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
		public Optional<Unrealised1Code> getValue(BalanceDetails6 obj) {
			return obj.getUnrealised();
		}

		@Override
		public void setValue(BalanceDetails6 obj, Optional<Unrealised1Code> value) {
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
	 * {@linkplain com.tools20022.repository.msg.BalanceDetails6
	 * BalanceDetails6}</li>
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
	public static final MMMessageAttribute<BalanceDetails6, AmountAndDirection31> mmAmount = new MMMessageAttribute<BalanceDetails6, AmountAndDirection31>() {
		{
			businessElementTrace_lazy = () -> CashBalance.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.BalanceDetails6.mmObject();
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
		public AmountAndDirection31 getValue(BalanceDetails6 obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(BalanceDetails6 obj, AmountAndDirection31 value) {
			obj.setAmount(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BalanceDetails6.mmCategory, com.tools20022.repository.msg.BalanceDetails6.mmType, com.tools20022.repository.msg.BalanceDetails6.mmUnrealised,
						com.tools20022.repository.msg.BalanceDetails6.mmAmount);
				trace_lazy = () -> Balance.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintBalanceTypeGuideline2.forBalanceDetails6);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BalanceDetails6";
				definition = "Balance related details for a portfolio.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<FinancialAssetTypeCategory1Code> getCategory() {
		return category == null ? Optional.empty() : Optional.of(category);
	}

	public BalanceDetails6 setCategory(FinancialAssetTypeCategory1Code category) {
		this.category = category;
		return this;
	}

	public Optional<BalanceType7Choice> getType() {
		return type == null ? Optional.empty() : Optional.of(type);
	}

	public BalanceDetails6 setType(BalanceType7Choice type) {
		this.type = type;
		return this;
	}

	public Optional<Unrealised1Code> getUnrealised() {
		return unrealised == null ? Optional.empty() : Optional.of(unrealised);
	}

	public BalanceDetails6 setUnrealised(Unrealised1Code unrealised) {
		this.unrealised = unrealised;
		return this;
	}

	public AmountAndDirection31 getAmount() {
		return amount;
	}

	public BalanceDetails6 setAmount(AmountAndDirection31 amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}
}