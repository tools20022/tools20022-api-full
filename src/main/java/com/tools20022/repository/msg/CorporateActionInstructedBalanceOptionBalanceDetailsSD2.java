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
import com.tools20022.repository.choice.OptionNumber1Choice;
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
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD2#mmPlaceAndName
 * CorporateActionInstructedBalanceOptionBalanceDetailsSD2.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD2#mmOptionNumber
 * CorporateActionInstructedBalanceOptionBalanceDetailsSD2.mmOptionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD2#mmOptionUncoveredProtectBalance
 * CorporateActionInstructedBalanceOptionBalanceDetailsSD2.
 * mmOptionUncoveredProtectBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD2#mmOptionDailyInstructedBalance
 * CorporateActionInstructedBalanceOptionBalanceDetailsSD2.
 * mmOptionDailyInstructedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD2#mmOptionOversubscriptionQuantity
 * CorporateActionInstructedBalanceOptionBalanceDetailsSD2.
 * mmOptionOversubscriptionQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD2#mmOptionUnacceptedBalance
 * CorporateActionInstructedBalanceOptionBalanceDetailsSD2.
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionInstructedBalanceOptionBalanceDetailsSD2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action instructed balance details at option level."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD1
 * CorporateActionInstructedBalanceOptionBalanceDetailsSD1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionInstructedBalanceOptionBalanceDetailsSD2", propOrder = {"placeAndName", "optionNumber", "optionUncoveredProtectBalance", "optionDailyInstructedBalance", "optionOversubscriptionQuantity",
		"optionUnacceptedBalance"})
public class CorporateActionInstructedBalanceOptionBalanceDetailsSD2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcAndNm")
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD2
	 * CorporateActionInstructedBalanceOptionBalanceDetailsSD2}</li>
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
	 * definition} = "Xpath to the element that is being extended."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD1#mmPlaceAndName
	 * CorporateActionInstructedBalanceOptionBalanceDetailsSD1.mmPlaceAndName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionInstructedBalanceOptionBalanceDetailsSD2, Optional<Max350Text>> mmPlaceAndName = new MMMessageAttribute<CorporateActionInstructedBalanceOptionBalanceDetailsSD2, Optional<Max350Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "Xpath to the element that is being extended.";
			previousVersion_lazy = () -> CorporateActionInstructedBalanceOptionBalanceDetailsSD1.mmPlaceAndName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(CorporateActionInstructedBalanceOptionBalanceDetailsSD2 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(CorporateActionInstructedBalanceOptionBalanceDetailsSD2 obj, Optional<Max350Text> value) {
			obj.setPlaceAndName(value.orElse(null));
		}
	};
	@XmlElement(name = "OptnNb", required = true)
	protected OptionNumber1Choice optionNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.OptionNumber1Choice
	 * OptionNumber1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD2
	 * CorporateActionInstructedBalanceOptionBalanceDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Option Number of the extended balances."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionInstructedBalanceOptionBalanceDetailsSD2, OptionNumber1Choice> mmOptionNumber = new MMMessageAssociationEnd<CorporateActionInstructedBalanceOptionBalanceDetailsSD2, OptionNumber1Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "OptnNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumber";
			definition = "Option Number of the extended balances.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> OptionNumber1Choice.mmObject();
		}

		@Override
		public OptionNumber1Choice getValue(CorporateActionInstructedBalanceOptionBalanceDetailsSD2 obj) {
			return obj.getOptionNumber();
		}

		@Override
		public void setValue(CorporateActionInstructedBalanceOptionBalanceDetailsSD2 obj, OptionNumber1Choice value) {
			obj.setOptionNumber(value);
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD2
	 * CorporateActionInstructedBalanceOptionBalanceDetailsSD2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD1#mmOptionUncoveredProtectBalance
	 * CorporateActionInstructedBalanceOptionBalanceDetailsSD1.
	 * mmOptionUncoveredProtectBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionInstructedBalanceOptionBalanceDetailsSD2, Optional<SignedQuantityFormat9>> mmOptionUncoveredProtectBalance = new MMMessageAssociationEnd<CorporateActionInstructedBalanceOptionBalanceDetailsSD2, Optional<SignedQuantityFormat9>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "OptnUcvrdPrtctBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionUncoveredProtectBalance";
			definition = "Balance of uncovered protect transactions at an option level.";
			previousVersion_lazy = () -> CorporateActionInstructedBalanceOptionBalanceDetailsSD1.mmOptionUncoveredProtectBalance;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SignedQuantityFormat9.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat9> getValue(CorporateActionInstructedBalanceOptionBalanceDetailsSD2 obj) {
			return obj.getOptionUncoveredProtectBalance();
		}

		@Override
		public void setValue(CorporateActionInstructedBalanceOptionBalanceDetailsSD2 obj, Optional<SignedQuantityFormat9> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD2
	 * CorporateActionInstructedBalanceOptionBalanceDetailsSD2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD1#mmOptionDailyInstructedBalance
	 * CorporateActionInstructedBalanceOptionBalanceDetailsSD1.
	 * mmOptionDailyInstructedBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionInstructedBalanceOptionBalanceDetailsSD2, Optional<SignedQuantityFormat9>> mmOptionDailyInstructedBalance = new MMMessageAssociationEnd<CorporateActionInstructedBalanceOptionBalanceDetailsSD2, Optional<SignedQuantityFormat9>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "OptnDalyInstdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionDailyInstructedBalance";
			definition = "Daily total of instructions for a given option. Balance will include only made instructions.";
			previousVersion_lazy = () -> CorporateActionInstructedBalanceOptionBalanceDetailsSD1.mmOptionDailyInstructedBalance;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SignedQuantityFormat9.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat9> getValue(CorporateActionInstructedBalanceOptionBalanceDetailsSD2 obj) {
			return obj.getOptionDailyInstructedBalance();
		}

		@Override
		public void setValue(CorporateActionInstructedBalanceOptionBalanceDetailsSD2 obj, Optional<SignedQuantityFormat9> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD2
	 * CorporateActionInstructedBalanceOptionBalanceDetailsSD2}</li>
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
	 * "For rights subscription events, total number of oversubscribed units. When there is an oversubscription privilege, this quantity will be included within the Instructed quantity in the core message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD1#mmOptionOversubscriptionQuantity
	 * CorporateActionInstructedBalanceOptionBalanceDetailsSD1.
	 * mmOptionOversubscriptionQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionInstructedBalanceOptionBalanceDetailsSD2, Optional<SignedQuantityFormat9>> mmOptionOversubscriptionQuantity = new MMMessageAssociationEnd<CorporateActionInstructedBalanceOptionBalanceDetailsSD2, Optional<SignedQuantityFormat9>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "OptnOvrsbcptQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionOversubscriptionQuantity";
			definition = "For rights subscription events, total number of oversubscribed units. When there is an oversubscription privilege, this quantity will be included within the Instructed quantity in the core message.";
			previousVersion_lazy = () -> CorporateActionInstructedBalanceOptionBalanceDetailsSD1.mmOptionOversubscriptionQuantity;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SignedQuantityFormat9.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat9> getValue(CorporateActionInstructedBalanceOptionBalanceDetailsSD2 obj) {
			return obj.getOptionOversubscriptionQuantity();
		}

		@Override
		public void setValue(CorporateActionInstructedBalanceOptionBalanceDetailsSD2 obj, Optional<SignedQuantityFormat9> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD2
	 * CorporateActionInstructedBalanceOptionBalanceDetailsSD2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD1#mmOptionUnacceptedBalance
	 * CorporateActionInstructedBalanceOptionBalanceDetailsSD1.
	 * mmOptionUnacceptedBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionInstructedBalanceOptionBalanceDetailsSD2, Optional<SignedQuantityFormat9>> mmOptionUnacceptedBalance = new MMMessageAssociationEnd<CorporateActionInstructedBalanceOptionBalanceDetailsSD2, Optional<SignedQuantityFormat9>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "OptnUaccptdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionUnacceptedBalance";
			definition = "For election merger events, the balance that is being moved into another option number for payment due to the proration of the original option.";
			previousVersion_lazy = () -> CorporateActionInstructedBalanceOptionBalanceDetailsSD1.mmOptionUnacceptedBalance;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SignedQuantityFormat9.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat9> getValue(CorporateActionInstructedBalanceOptionBalanceDetailsSD2 obj) {
			return obj.getOptionUnacceptedBalance();
		}

		@Override
		public void setValue(CorporateActionInstructedBalanceOptionBalanceDetailsSD2 obj, Optional<SignedQuantityFormat9> value) {
			obj.setOptionUnacceptedBalance(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD2.mmPlaceAndName,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD2.mmOptionNumber,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD2.mmOptionUncoveredProtectBalance,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD2.mmOptionDailyInstructedBalance,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD2.mmOptionOversubscriptionQuantity,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD2.mmOptionUnacceptedBalance);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionInstructedBalanceOptionBalanceDetailsSD2";
				definition = "Provides additional information regarding corporate action instructed balance details at option level.";
				previousVersion_lazy = () -> CorporateActionInstructedBalanceOptionBalanceDetailsSD1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max350Text> getPlaceAndName() {
		return placeAndName == null ? Optional.empty() : Optional.of(placeAndName);
	}

	public CorporateActionInstructedBalanceOptionBalanceDetailsSD2 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
		return this;
	}

	public OptionNumber1Choice getOptionNumber() {
		return optionNumber;
	}

	public CorporateActionInstructedBalanceOptionBalanceDetailsSD2 setOptionNumber(OptionNumber1Choice optionNumber) {
		this.optionNumber = Objects.requireNonNull(optionNumber);
		return this;
	}

	public Optional<SignedQuantityFormat9> getOptionUncoveredProtectBalance() {
		return optionUncoveredProtectBalance == null ? Optional.empty() : Optional.of(optionUncoveredProtectBalance);
	}

	public CorporateActionInstructedBalanceOptionBalanceDetailsSD2 setOptionUncoveredProtectBalance(SignedQuantityFormat9 optionUncoveredProtectBalance) {
		this.optionUncoveredProtectBalance = optionUncoveredProtectBalance;
		return this;
	}

	public Optional<SignedQuantityFormat9> getOptionDailyInstructedBalance() {
		return optionDailyInstructedBalance == null ? Optional.empty() : Optional.of(optionDailyInstructedBalance);
	}

	public CorporateActionInstructedBalanceOptionBalanceDetailsSD2 setOptionDailyInstructedBalance(SignedQuantityFormat9 optionDailyInstructedBalance) {
		this.optionDailyInstructedBalance = optionDailyInstructedBalance;
		return this;
	}

	public Optional<SignedQuantityFormat9> getOptionOversubscriptionQuantity() {
		return optionOversubscriptionQuantity == null ? Optional.empty() : Optional.of(optionOversubscriptionQuantity);
	}

	public CorporateActionInstructedBalanceOptionBalanceDetailsSD2 setOptionOversubscriptionQuantity(SignedQuantityFormat9 optionOversubscriptionQuantity) {
		this.optionOversubscriptionQuantity = optionOversubscriptionQuantity;
		return this;
	}

	public Optional<SignedQuantityFormat9> getOptionUnacceptedBalance() {
		return optionUnacceptedBalance == null ? Optional.empty() : Optional.of(optionUnacceptedBalance);
	}

	public CorporateActionInstructedBalanceOptionBalanceDetailsSD2 setOptionUnacceptedBalance(SignedQuantityFormat9 optionUnacceptedBalance) {
		this.optionUnacceptedBalance = optionUnacceptedBalance;
		return this;
	}
}