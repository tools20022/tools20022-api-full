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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Commodity2;
import com.tools20022.repository.msg.Guarantee1;
import com.tools20022.repository.msg.SecurityIdentificationAndAmount1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Holding of financial instrument for collateral purposes.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.AssetHolding1Choice#mmGold
 * AssetHolding1Choice.mmGold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetHolding1Choice#mmTriparty
 * AssetHolding1Choice.mmTriparty}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AssetHolding1Choice#mmCash
 * AssetHolding1Choice.mmCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetHolding1Choice#mmSecurity
 * AssetHolding1Choice.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetHolding1Choice#mmGuarantee
 * AssetHolding1Choice.mmGuarantee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetHolding1Choice#mmCommodity
 * AssetHolding1Choice.mmCommodity}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AssetHolding1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Holding of financial instrument for collateral purposes."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AssetHolding1Choice", propOrder = {"gold", "triparty", "cash", "security", "guarantee", "commodity"})
public class AssetHolding1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Gold", required = true)
	protected ActiveCurrencyAndAmount gold;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetHolding1Choice
	 * AssetHolding1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Gold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Gold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Mark-to-market pre-haircut value of gold collateral.\r\n"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AssetHolding1Choice, ActiveCurrencyAndAmount> mmGold = new MMMessageAttribute<AssetHolding1Choice, ActiveCurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.AssetHolding1Choice.mmObject();
			isDerived = false;
			xmlTag = "Gold";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Gold";
			definition = "Mark-to-market pre-haircut value of gold collateral.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(AssetHolding1Choice obj) {
			return obj.getGold();
		}

		@Override
		public void setValue(AssetHolding1Choice obj, ActiveCurrencyAndAmount value) {
			obj.setGold(value);
		}
	};
	@XmlElement(name = "Trpty", required = true)
	protected ActiveCurrencyAndAmount triparty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetHolding1Choice
	 * AssetHolding1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Trpty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Triparty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Mark-to-market pre-haircut value of triparty collateral.\r\n"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AssetHolding1Choice, ActiveCurrencyAndAmount> mmTriparty = new MMMessageAttribute<AssetHolding1Choice, ActiveCurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.AssetHolding1Choice.mmObject();
			isDerived = false;
			xmlTag = "Trpty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Triparty";
			definition = "Mark-to-market pre-haircut value of triparty collateral.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(AssetHolding1Choice obj) {
			return obj.getTriparty();
		}

		@Override
		public void setValue(AssetHolding1Choice obj, ActiveCurrencyAndAmount value) {
			obj.setTriparty(value);
		}
	};
	@XmlElement(name = "Csh", required = true)
	protected ActiveCurrencyAndAmount cash;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetHolding1Choice
	 * AssetHolding1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Csh"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value of cash collateral.\r\n"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AssetHolding1Choice, ActiveCurrencyAndAmount> mmCash = new MMMessageAttribute<AssetHolding1Choice, ActiveCurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.AssetHolding1Choice.mmObject();
			isDerived = false;
			xmlTag = "Csh";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cash";
			definition = "Value of cash collateral.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(AssetHolding1Choice obj) {
			return obj.getCash();
		}

		@Override
		public void setValue(AssetHolding1Choice obj, ActiveCurrencyAndAmount value) {
			obj.setCash(value);
		}
	};
	@XmlElement(name = "Scty", required = true)
	protected SecurityIdentificationAndAmount1 security;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentificationAndAmount1
	 * SecurityIdentificationAndAmount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetHolding1Choice
	 * AssetHolding1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Scty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification and value of the outright investment."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AssetHolding1Choice, SecurityIdentificationAndAmount1> mmSecurity = new MMMessageAssociationEnd<AssetHolding1Choice, SecurityIdentificationAndAmount1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.AssetHolding1Choice.mmObject();
			isDerived = false;
			xmlTag = "Scty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Security";
			definition = "Identification and value of the outright investment.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecurityIdentificationAndAmount1.mmObject();
		}

		@Override
		public SecurityIdentificationAndAmount1 getValue(AssetHolding1Choice obj) {
			return obj.getSecurity();
		}

		@Override
		public void setValue(AssetHolding1Choice obj, SecurityIdentificationAndAmount1 value) {
			obj.setSecurity(value);
		}
	};
	@XmlElement(name = "Grnt", required = true)
	protected Guarantee1 guarantee;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Guarantee1 Guarantee1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetHolding1Choice
	 * AssetHolding1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Grnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Guarantee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Promise to meet the obligations of a clearing member provided by a third party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AssetHolding1Choice, Guarantee1> mmGuarantee = new MMMessageAssociationEnd<AssetHolding1Choice, Guarantee1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.AssetHolding1Choice.mmObject();
			isDerived = false;
			xmlTag = "Grnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Guarantee";
			definition = "Promise to meet the obligations of a clearing member provided by a third party.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Guarantee1.mmObject();
		}

		@Override
		public Guarantee1 getValue(AssetHolding1Choice obj) {
			return obj.getGuarantee();
		}

		@Override
		public void setValue(AssetHolding1Choice obj, Guarantee1 value) {
			obj.setGuarantee(value);
		}
	};
	@XmlElement(name = "Cmmdty", required = true)
	protected Commodity2 commodity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Commodity2 Commodity2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetHolding1Choice
	 * AssetHolding1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cmmdty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Commodity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Mark-to-market pre-haircut value of other commodity collateral.\r\n"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AssetHolding1Choice, Commodity2> mmCommodity = new MMMessageAssociationEnd<AssetHolding1Choice, Commodity2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.AssetHolding1Choice.mmObject();
			isDerived = false;
			xmlTag = "Cmmdty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Commodity";
			definition = "Mark-to-market pre-haircut value of other commodity collateral.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Commodity2.mmObject();
		}

		@Override
		public Commodity2 getValue(AssetHolding1Choice obj) {
			return obj.getCommodity();
		}

		@Override
		public void setValue(AssetHolding1Choice obj, Commodity2 value) {
			obj.setCommodity(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AssetHolding1Choice.mmGold, com.tools20022.repository.choice.AssetHolding1Choice.mmTriparty,
						com.tools20022.repository.choice.AssetHolding1Choice.mmCash, com.tools20022.repository.choice.AssetHolding1Choice.mmSecurity, com.tools20022.repository.choice.AssetHolding1Choice.mmGuarantee,
						com.tools20022.repository.choice.AssetHolding1Choice.mmCommodity);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "AssetHolding1Choice";
				definition = "Holding of financial instrument for collateral purposes.";
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveCurrencyAndAmount getGold() {
		return gold;
	}

	public AssetHolding1Choice setGold(ActiveCurrencyAndAmount gold) {
		this.gold = Objects.requireNonNull(gold);
		return this;
	}

	public ActiveCurrencyAndAmount getTriparty() {
		return triparty;
	}

	public AssetHolding1Choice setTriparty(ActiveCurrencyAndAmount triparty) {
		this.triparty = Objects.requireNonNull(triparty);
		return this;
	}

	public ActiveCurrencyAndAmount getCash() {
		return cash;
	}

	public AssetHolding1Choice setCash(ActiveCurrencyAndAmount cash) {
		this.cash = Objects.requireNonNull(cash);
		return this;
	}

	public SecurityIdentificationAndAmount1 getSecurity() {
		return security;
	}

	public AssetHolding1Choice setSecurity(SecurityIdentificationAndAmount1 security) {
		this.security = Objects.requireNonNull(security);
		return this;
	}

	public Guarantee1 getGuarantee() {
		return guarantee;
	}

	public AssetHolding1Choice setGuarantee(Guarantee1 guarantee) {
		this.guarantee = Objects.requireNonNull(guarantee);
		return this;
	}

	public Commodity2 getCommodity() {
		return commodity;
	}

	public AssetHolding1Choice setCommodity(Commodity2 commodity) {
		this.commodity = Objects.requireNonNull(commodity);
		return this;
	}
}