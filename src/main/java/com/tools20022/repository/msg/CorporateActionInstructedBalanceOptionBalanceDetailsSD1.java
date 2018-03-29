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
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SignedQuantityFormat9;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides additional information regarding corporate action instructed balance
 * details at option level.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD1#mmPlaceAndName
 * CorporateActionInstructedBalanceOptionBalanceDetailsSD1.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD1#mmOptionUncoveredProtectBalance
 * CorporateActionInstructedBalanceOptionBalanceDetailsSD1.
 * mmOptionUncoveredProtectBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD1#mmOptionDailyInstructedBalance
 * CorporateActionInstructedBalanceOptionBalanceDetailsSD1.
 * mmOptionDailyInstructedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD1#mmOptionOversubscriptionQuantity
 * CorporateActionInstructedBalanceOptionBalanceDetailsSD1.
 * mmOptionOversubscriptionQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD1#mmOptionUnacceptedBalance
 * CorporateActionInstructedBalanceOptionBalanceDetailsSD1.
 * mmOptionUnacceptedBalance}</li>
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
 * "CorporateActionInstructedBalanceOptionBalanceDetailsSD1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action instructed balance details at option level."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD2
 * CorporateActionInstructedBalanceOptionBalanceDetailsSD2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionInstructedBalanceOptionBalanceDetailsSD1", propOrder = {"placeAndName", "optionUncoveredProtectBalance", "optionDailyInstructedBalance", "optionOversubscriptionQuantity", "optionUnacceptedBalance"})
public class CorporateActionInstructedBalanceOptionBalanceDetailsSD1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcAndNm", required = true)
	protected Max350Text placeAndName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD1
	 * CorporateActionInstructedBalanceOptionBalanceDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "xPath to the element that is being extended."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD2#mmPlaceAndName
	 * CorporateActionInstructedBalanceOptionBalanceDetailsSD2.mmPlaceAndName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionInstructedBalanceOptionBalanceDetailsSD1, Max350Text> mmPlaceAndName = new MMMessageAttribute<CorporateActionInstructedBalanceOptionBalanceDetailsSD1, Max350Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionInstructedBalanceOptionBalanceDetailsSD2.mmPlaceAndName);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(CorporateActionInstructedBalanceOptionBalanceDetailsSD1 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(CorporateActionInstructedBalanceOptionBalanceDetailsSD1 obj, Max350Text value) {
			obj.setPlaceAndName(value);
		}
	};
	@XmlElement(name = "OptnUcvrdPrtctBal")
	protected SignedQuantityFormat9 optionUncoveredProtectBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat9
	 * SignedQuantityFormat9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD1
	 * CorporateActionInstructedBalanceOptionBalanceDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnUcvrdPrtctBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionUncoveredProtectBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of uncovered protect transactions at an option level."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD2#mmOptionUncoveredProtectBalance
	 * CorporateActionInstructedBalanceOptionBalanceDetailsSD2.
	 * mmOptionUncoveredProtectBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionInstructedBalanceOptionBalanceDetailsSD1, Optional<SignedQuantityFormat9>> mmOptionUncoveredProtectBalance = new MMMessageAssociationEnd<CorporateActionInstructedBalanceOptionBalanceDetailsSD1, Optional<SignedQuantityFormat9>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "OptnUcvrdPrtctBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionUncoveredProtectBalance";
			definition = "Balance of uncovered protect transactions at an option level.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionInstructedBalanceOptionBalanceDetailsSD2.mmOptionUncoveredProtectBalance);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SignedQuantityFormat9.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat9> getValue(CorporateActionInstructedBalanceOptionBalanceDetailsSD1 obj) {
			return obj.getOptionUncoveredProtectBalance();
		}

		@Override
		public void setValue(CorporateActionInstructedBalanceOptionBalanceDetailsSD1 obj, Optional<SignedQuantityFormat9> value) {
			obj.setOptionUncoveredProtectBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "OptnDalyInstdBal")
	protected SignedQuantityFormat9 optionDailyInstructedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat9
	 * SignedQuantityFormat9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD1
	 * CorporateActionInstructedBalanceOptionBalanceDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnDalyInstdBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionDailyInstructedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Daily total of instructions for a given option. Balance will include only made instructions."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD2#mmOptionDailyInstructedBalance
	 * CorporateActionInstructedBalanceOptionBalanceDetailsSD2.
	 * mmOptionDailyInstructedBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionInstructedBalanceOptionBalanceDetailsSD1, Optional<SignedQuantityFormat9>> mmOptionDailyInstructedBalance = new MMMessageAssociationEnd<CorporateActionInstructedBalanceOptionBalanceDetailsSD1, Optional<SignedQuantityFormat9>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "OptnDalyInstdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionDailyInstructedBalance";
			definition = "Daily total of instructions for a given option. Balance will include only made instructions.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionInstructedBalanceOptionBalanceDetailsSD2.mmOptionDailyInstructedBalance);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SignedQuantityFormat9.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat9> getValue(CorporateActionInstructedBalanceOptionBalanceDetailsSD1 obj) {
			return obj.getOptionDailyInstructedBalance();
		}

		@Override
		public void setValue(CorporateActionInstructedBalanceOptionBalanceDetailsSD1 obj, Optional<SignedQuantityFormat9> value) {
			obj.setOptionDailyInstructedBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "OptnOvrsbcptQty")
	protected SignedQuantityFormat9 optionOversubscriptionQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat9
	 * SignedQuantityFormat9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD1
	 * CorporateActionInstructedBalanceOptionBalanceDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnOvrsbcptQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionOversubscriptionQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For rights subscription events, total number of oversubscribed units. When there is an oversubscription priviledge, this quantity will be included within the Instructed quantityin the core message."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD2#mmOptionOversubscriptionQuantity
	 * CorporateActionInstructedBalanceOptionBalanceDetailsSD2.
	 * mmOptionOversubscriptionQuantity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionInstructedBalanceOptionBalanceDetailsSD1, Optional<SignedQuantityFormat9>> mmOptionOversubscriptionQuantity = new MMMessageAssociationEnd<CorporateActionInstructedBalanceOptionBalanceDetailsSD1, Optional<SignedQuantityFormat9>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "OptnOvrsbcptQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionOversubscriptionQuantity";
			definition = "For rights subscription events, total number of oversubscribed units. When there is an oversubscription priviledge, this quantity will be included within the Instructed quantityin the core message.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionInstructedBalanceOptionBalanceDetailsSD2.mmOptionOversubscriptionQuantity);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SignedQuantityFormat9.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat9> getValue(CorporateActionInstructedBalanceOptionBalanceDetailsSD1 obj) {
			return obj.getOptionOversubscriptionQuantity();
		}

		@Override
		public void setValue(CorporateActionInstructedBalanceOptionBalanceDetailsSD1 obj, Optional<SignedQuantityFormat9> value) {
			obj.setOptionOversubscriptionQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "OptnUaccptdBal")
	protected SignedQuantityFormat9 optionUnacceptedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat9
	 * SignedQuantityFormat9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD1
	 * CorporateActionInstructedBalanceOptionBalanceDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnUaccptdBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionUnacceptedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For election merger events, the balance that is being moved into another option number for payment due to the proration of the original option."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD2#mmOptionUnacceptedBalance
	 * CorporateActionInstructedBalanceOptionBalanceDetailsSD2.
	 * mmOptionUnacceptedBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionInstructedBalanceOptionBalanceDetailsSD1, Optional<SignedQuantityFormat9>> mmOptionUnacceptedBalance = new MMMessageAssociationEnd<CorporateActionInstructedBalanceOptionBalanceDetailsSD1, Optional<SignedQuantityFormat9>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "OptnUaccptdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionUnacceptedBalance";
			definition = "For election merger events, the balance that is being moved into another option number for payment due to the proration of the original option.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionInstructedBalanceOptionBalanceDetailsSD2.mmOptionUnacceptedBalance);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SignedQuantityFormat9.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat9> getValue(CorporateActionInstructedBalanceOptionBalanceDetailsSD1 obj) {
			return obj.getOptionUnacceptedBalance();
		}

		@Override
		public void setValue(CorporateActionInstructedBalanceOptionBalanceDetailsSD1 obj, Optional<SignedQuantityFormat9> value) {
			obj.setOptionUnacceptedBalance(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD1.mmPlaceAndName,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD1.mmOptionUncoveredProtectBalance,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD1.mmOptionDailyInstructedBalance,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD1.mmOptionOversubscriptionQuantity,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD1.mmOptionUnacceptedBalance);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CorporateActionInstructedBalanceOptionBalanceDetailsSD1";
				definition = "Provides additional information regarding corporate action instructed balance details at option level.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionInstructedBalanceOptionBalanceDetailsSD2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public CorporateActionInstructedBalanceOptionBalanceDetailsSD1 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = Objects.requireNonNull(placeAndName);
		return this;
	}

	public Optional<SignedQuantityFormat9> getOptionUncoveredProtectBalance() {
		return optionUncoveredProtectBalance == null ? Optional.empty() : Optional.of(optionUncoveredProtectBalance);
	}

	public CorporateActionInstructedBalanceOptionBalanceDetailsSD1 setOptionUncoveredProtectBalance(SignedQuantityFormat9 optionUncoveredProtectBalance) {
		this.optionUncoveredProtectBalance = optionUncoveredProtectBalance;
		return this;
	}

	public Optional<SignedQuantityFormat9> getOptionDailyInstructedBalance() {
		return optionDailyInstructedBalance == null ? Optional.empty() : Optional.of(optionDailyInstructedBalance);
	}

	public CorporateActionInstructedBalanceOptionBalanceDetailsSD1 setOptionDailyInstructedBalance(SignedQuantityFormat9 optionDailyInstructedBalance) {
		this.optionDailyInstructedBalance = optionDailyInstructedBalance;
		return this;
	}

	public Optional<SignedQuantityFormat9> getOptionOversubscriptionQuantity() {
		return optionOversubscriptionQuantity == null ? Optional.empty() : Optional.of(optionOversubscriptionQuantity);
	}

	public CorporateActionInstructedBalanceOptionBalanceDetailsSD1 setOptionOversubscriptionQuantity(SignedQuantityFormat9 optionOversubscriptionQuantity) {
		this.optionOversubscriptionQuantity = optionOversubscriptionQuantity;
		return this;
	}

	public Optional<SignedQuantityFormat9> getOptionUnacceptedBalance() {
		return optionUnacceptedBalance == null ? Optional.empty() : Optional.of(optionUnacceptedBalance);
	}

	public CorporateActionInstructedBalanceOptionBalanceDetailsSD1 setOptionUnacceptedBalance(SignedQuantityFormat9 optionUnacceptedBalance) {
		this.optionUnacceptedBalance = optionUnacceptedBalance;
		return this;
	}
}