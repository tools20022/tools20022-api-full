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
import com.tools20022.repository.choice.DateAndDateTime1Choice;
import com.tools20022.repository.choice.OptionRight1Choice;
import com.tools20022.repository.codeset.Appearance1Code;
import com.tools20022.repository.codeset.FutureAndOptionContractType1Code;
import com.tools20022.repository.codeset.UnitOfMeasure1Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Price4;
import com.tools20022.repository.msg.Rating1;
import com.tools20022.repository.msg.UnderlyingRatio1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Parameters for contracts which obligate the buyer to receive and the seller
 * to deliver in the future the assets specified at an agreed price or contracts
 * which grant to the holder either the privilege to purchase or the privilege
 * to sell the assets specified at a predetermined price or formula at or within
 * a time in the future.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#mmFutureAndOptionContractType
 * FutureOrOptionDetails1.mmFutureAndOptionContractType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#mmLastDeliveryDate
 * FutureOrOptionDetails1.mmLastDeliveryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#mmUnitOfMeasure
 * FutureOrOptionDetails1.mmUnitOfMeasure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#mmFutureDate
 * FutureOrOptionDetails1.mmFutureDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#mmMinimumSize
 * FutureOrOptionDetails1.mmMinimumSize}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#mmAnnouncementDate
 * FutureOrOptionDetails1.mmAnnouncementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#mmAppearance
 * FutureOrOptionDetails1.mmAppearance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#mmStrippableIndicator
 * FutureOrOptionDetails1.mmStrippableIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#mmPositionLimit
 * FutureOrOptionDetails1.mmPositionLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#mmNearTermPositionLimit
 * FutureOrOptionDetails1.mmNearTermPositionLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#mmMinimumTradingPricingIncrement
 * FutureOrOptionDetails1.mmMinimumTradingPricingIncrement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#mmPurpose
 * FutureOrOptionDetails1.mmPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#mmContractSettlementMonth
 * FutureOrOptionDetails1.mmContractSettlementMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#mmFirstDealingDate
 * FutureOrOptionDetails1.mmFirstDealingDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#mmRatio
 * FutureOrOptionDetails1.mmRatio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#mmRating
 * FutureOrOptionDetails1.mmRating}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#mmIssuePrice
 * FutureOrOptionDetails1.mmIssuePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#mmOptionRights
 * FutureOrOptionDetails1.mmOptionRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#mmLastTransaction
 * FutureOrOptionDetails1.mmLastTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#mmSpreadTransaction
 * FutureOrOptionDetails1.mmSpreadTransaction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
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
 * "FutureOrOptionDetails1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Parameters for contracts which obligate the buyer to receive and the seller to deliver in the future the assets specified at an agreed price or contracts which grant to the holder either the privilege to purchase or the privilege to sell the assets specified at a predetermined price or formula at or within a time in the future."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FutureOrOptionDetails1", propOrder = {"futureAndOptionContractType", "lastDeliveryDate", "unitOfMeasure", "futureDate", "minimumSize", "announcementDate", "appearance", "strippableIndicator", "positionLimit",
		"nearTermPositionLimit", "minimumTradingPricingIncrement", "purpose", "contractSettlementMonth", "firstDealingDate", "ratio", "rating", "issuePrice", "optionRights", "lastTransaction", "spreadTransaction"})
public class FutureOrOptionDetails1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "FutrAndOptnCtrctTp")
	protected FutureAndOptionContractType1Code futureAndOptionContractType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FutureAndOptionContractType1Code
	 * FutureAndOptionContractType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1
	 * FutureOrOptionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FutrAndOptnCtrctTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FutureAndOptionContractType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of the contract for futures and options."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FutureOrOptionDetails1, Optional<FutureAndOptionContractType1Code>> mmFutureAndOptionContractType = new MMMessageAttribute<FutureOrOptionDetails1, Optional<FutureAndOptionContractType1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FutureOrOptionDetails1.mmObject();
			isDerived = false;
			xmlTag = "FutrAndOptnCtrctTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FutureAndOptionContractType";
			definition = "Specifies the type of the contract for futures and options.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> FutureAndOptionContractType1Code.mmObject();
		}

		@Override
		public Optional<FutureAndOptionContractType1Code> getValue(FutureOrOptionDetails1 obj) {
			return obj.getFutureAndOptionContractType();
		}

		@Override
		public void setValue(FutureOrOptionDetails1 obj, Optional<FutureAndOptionContractType1Code> value) {
			obj.setFutureAndOptionContractType(value.orElse(null));
		}
	};
	@XmlElement(name = "LastDlvryDt")
	protected ISODateTime lastDeliveryDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Future#mmLastDeliveryDate
	 * Future.mmLastDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1
	 * FutureOrOptionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LastDlvryDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LastDeliveryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last date/time by which the option for physical delivery may still be exercised."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FutureOrOptionDetails1, Optional<ISODateTime>> mmLastDeliveryDate = new MMMessageAttribute<FutureOrOptionDetails1, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> Future.mmLastDeliveryDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.FutureOrOptionDetails1.mmObject();
			isDerived = false;
			xmlTag = "LastDlvryDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastDeliveryDate";
			definition = "Last date/time by which the option for physical delivery may still be exercised.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(FutureOrOptionDetails1 obj) {
			return obj.getLastDeliveryDate();
		}

		@Override
		public void setValue(FutureOrOptionDetails1 obj, Optional<ISODateTime> value) {
			obj.setLastDeliveryDate(value.orElse(null));
		}
	};
	@XmlElement(name = "UnitOfMeasr")
	protected UnitOfMeasure1Code unitOfMeasure;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Future#mmUnitOfMeasure
	 * Future.mmUnitOfMeasure}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1
	 * FutureOrOptionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnitOfMeasr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitOfMeasure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used to indicate the size of the underlying commodity on which the contract is based (e.g., 2500 lbs of lean cattle, 1000 barrels of crude oil, 1000 bushels of corn, etc.)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FutureOrOptionDetails1, Optional<UnitOfMeasure1Code>> mmUnitOfMeasure = new MMMessageAttribute<FutureOrOptionDetails1, Optional<UnitOfMeasure1Code>>() {
		{
			businessElementTrace_lazy = () -> Future.mmUnitOfMeasure;
			componentContext_lazy = () -> com.tools20022.repository.msg.FutureOrOptionDetails1.mmObject();
			isDerived = false;
			xmlTag = "UnitOfMeasr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitOfMeasure";
			definition = "Used to indicate the size of the underlying commodity on which the contract is based (e.g., 2500 lbs of lean cattle, 1000 barrels of crude oil, 1000 bushels of corn, etc.).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> UnitOfMeasure1Code.mmObject();
		}

		@Override
		public Optional<UnitOfMeasure1Code> getValue(FutureOrOptionDetails1 obj) {
			return obj.getUnitOfMeasure();
		}

		@Override
		public void setValue(FutureOrOptionDetails1 obj, Optional<UnitOfMeasure1Code> value) {
			obj.setUnitOfMeasure(value.orElse(null));
		}
	};
	@XmlElement(name = "FutrDt")
	protected ISODateTime futureDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Future#mmFutureDate
	 * Future.mmFutureDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1
	 * FutureOrOptionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FutrDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FutureDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which future contracts settle."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FutureOrOptionDetails1, Optional<ISODateTime>> mmFutureDate = new MMMessageAttribute<FutureOrOptionDetails1, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> Future.mmFutureDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.FutureOrOptionDetails1.mmObject();
			isDerived = false;
			xmlTag = "FutrDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FutureDate";
			definition = "Date on which future contracts settle.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(FutureOrOptionDetails1 obj) {
			return obj.getFutureDate();
		}

		@Override
		public void setValue(FutureOrOptionDetails1 obj, Optional<ISODateTime> value) {
			obj.setFutureDate(value.orElse(null));
		}
	};
	@XmlElement(name = "MinSz")
	protected ActiveCurrencyAndAmount minimumSize;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Future#mmMinimumSize
	 * Future.mmMinimumSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1
	 * FutureOrOptionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinSz"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumSize"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the minimum ratio or multiply factor used to convert from contracts to shares."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FutureOrOptionDetails1, Optional<ActiveCurrencyAndAmount>> mmMinimumSize = new MMMessageAttribute<FutureOrOptionDetails1, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Future.mmMinimumSize;
			componentContext_lazy = () -> com.tools20022.repository.msg.FutureOrOptionDetails1.mmObject();
			isDerived = false;
			xmlTag = "MinSz";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumSize";
			definition = "Specifies the minimum ratio or multiply factor used to convert from contracts to shares.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(FutureOrOptionDetails1 obj) {
			return obj.getMinimumSize();
		}

		@Override
		public void setValue(FutureOrOptionDetails1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setMinimumSize(value.orElse(null));
		}
	};
	@XmlElement(name = "AnncmntDt")
	protected ISODateTime announcementDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmIssueDate
	 * Issuance.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1
	 * FutureOrOptionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AnncmntDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnnouncementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time, as announced by the issuer, at which the securities will be issued."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FutureOrOptionDetails1, Optional<ISODateTime>> mmAnnouncementDate = new MMMessageAttribute<FutureOrOptionDetails1, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> Issuance.mmIssueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.FutureOrOptionDetails1.mmObject();
			isDerived = false;
			xmlTag = "AnncmntDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnnouncementDate";
			definition = "Date/time, as announced by the issuer, at which the securities will be issued.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(FutureOrOptionDetails1 obj) {
			return obj.getAnnouncementDate();
		}

		@Override
		public void setValue(FutureOrOptionDetails1 obj, Optional<ISODateTime> value) {
			obj.setAnnouncementDate(value.orElse(null));
		}
	};
	@XmlElement(name = "Apprnc")
	protected Appearance1Code appearance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Appearance1Code
	 * Appearance1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmAppearance
	 * Security.mmAppearance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1
	 * FutureOrOptionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Apprnc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Appearance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the deliverability of a security."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FutureOrOptionDetails1, Optional<Appearance1Code>> mmAppearance = new MMMessageAttribute<FutureOrOptionDetails1, Optional<Appearance1Code>>() {
		{
			businessElementTrace_lazy = () -> Security.mmAppearance;
			componentContext_lazy = () -> com.tools20022.repository.msg.FutureOrOptionDetails1.mmObject();
			isDerived = false;
			xmlTag = "Apprnc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Appearance";
			definition = "Specifies the deliverability of a security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Appearance1Code.mmObject();
		}

		@Override
		public Optional<Appearance1Code> getValue(FutureOrOptionDetails1 obj) {
			return obj.getAppearance();
		}

		@Override
		public void setValue(FutureOrOptionDetails1 obj, Optional<Appearance1Code> value) {
			obj.setAppearance(value.orElse(null));
		}
	};
	@XmlElement(name = "StrpblInd")
	protected YesNoIndicator strippableIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmStrippableIndicator
	 * Security.mmStrippableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1
	 * FutureOrOptionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StrpblInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StrippableIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the interest is separable from the principal."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FutureOrOptionDetails1, Optional<YesNoIndicator>> mmStrippableIndicator = new MMMessageAttribute<FutureOrOptionDetails1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Security.mmStrippableIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.FutureOrOptionDetails1.mmObject();
			isDerived = false;
			xmlTag = "StrpblInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StrippableIndicator";
			definition = "Indicates whether the interest is separable from the principal.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(FutureOrOptionDetails1 obj) {
			return obj.getStrippableIndicator();
		}

		@Override
		public void setValue(FutureOrOptionDetails1 obj, Optional<YesNoIndicator> value) {
			obj.setStrippableIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "PosLmt")
	protected Number positionLimit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Option#mmPositionLimit
	 * Option.mmPositionLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1
	 * FutureOrOptionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PosLmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PositionLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the maximum number of listed option contracts on a single security which can be held by an investor or group of investors acting jointly."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FutureOrOptionDetails1, Optional<Number>> mmPositionLimit = new MMMessageAttribute<FutureOrOptionDetails1, Optional<Number>>() {
		{
			businessElementTrace_lazy = () -> Option.mmPositionLimit;
			componentContext_lazy = () -> com.tools20022.repository.msg.FutureOrOptionDetails1.mmObject();
			isDerived = false;
			xmlTag = "PosLmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PositionLimit";
			definition = "Indicates the maximum number of listed option contracts on a single security which can be held by an investor or group of investors acting jointly.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(FutureOrOptionDetails1 obj) {
			return obj.getPositionLimit();
		}

		@Override
		public void setValue(FutureOrOptionDetails1 obj, Optional<Number> value) {
			obj.setPositionLimit(value.orElse(null));
		}
	};
	@XmlElement(name = "NearTermPosLmt")
	protected Number nearTermPositionLimit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmNearTermPositionLimit
	 * Security.mmNearTermPositionLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1
	 * FutureOrOptionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NearTermPosLmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NearTermPositionLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Position limit in the near-term contract for a given exchange-traded product."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FutureOrOptionDetails1, Optional<Number>> mmNearTermPositionLimit = new MMMessageAttribute<FutureOrOptionDetails1, Optional<Number>>() {
		{
			businessElementTrace_lazy = () -> Security.mmNearTermPositionLimit;
			componentContext_lazy = () -> com.tools20022.repository.msg.FutureOrOptionDetails1.mmObject();
			isDerived = false;
			xmlTag = "NearTermPosLmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NearTermPositionLimit";
			definition = "Position limit in the near-term contract for a given exchange-traded product.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(FutureOrOptionDetails1 obj) {
			return obj.getNearTermPositionLimit();
		}

		@Override
		public void setValue(FutureOrOptionDetails1 obj, Optional<Number> value) {
			obj.setNearTermPositionLimit(value.orElse(null));
		}
	};
	@XmlElement(name = "MinTradgPricgIncrmt")
	protected Number minimumTradingPricingIncrement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmMinimumTradingPricingIncrement
	 * Security.mmMinimumTradingPricingIncrement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1
	 * FutureOrOptionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinTradgPricgIncrmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumTradingPricingIncrement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum price increase for a given exchange-traded Instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FutureOrOptionDetails1, Optional<Number>> mmMinimumTradingPricingIncrement = new MMMessageAttribute<FutureOrOptionDetails1, Optional<Number>>() {
		{
			businessElementTrace_lazy = () -> Security.mmMinimumTradingPricingIncrement;
			componentContext_lazy = () -> com.tools20022.repository.msg.FutureOrOptionDetails1.mmObject();
			isDerived = false;
			xmlTag = "MinTradgPricgIncrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumTradingPricingIncrement";
			definition = "Minimum price increase for a given exchange-traded Instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(FutureOrOptionDetails1 obj) {
			return obj.getMinimumTradingPricingIncrement();
		}

		@Override
		public void setValue(FutureOrOptionDetails1 obj, Optional<Number> value) {
			obj.setMinimumTradingPricingIncrement(value.orElse(null));
		}
	};
	@XmlElement(name = "Purp")
	protected Max256Text purpose;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmPurpose
	 * Issuance.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1
	 * FutureOrOptionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Purp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Purpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason for which money is raised through the issuance of a security."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FutureOrOptionDetails1, Optional<Max256Text>> mmPurpose = new MMMessageAttribute<FutureOrOptionDetails1, Optional<Max256Text>>() {
		{
			businessElementTrace_lazy = () -> Issuance.mmPurpose;
			componentContext_lazy = () -> com.tools20022.repository.msg.FutureOrOptionDetails1.mmObject();
			isDerived = false;
			xmlTag = "Purp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Purpose";
			definition = "Reason for which money is raised through the issuance of a security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max256Text.mmObject();
		}

		@Override
		public Optional<Max256Text> getValue(FutureOrOptionDetails1 obj) {
			return obj.getPurpose();
		}

		@Override
		public void setValue(FutureOrOptionDetails1 obj, Optional<Max256Text> value) {
			obj.setPurpose(value.orElse(null));
		}
	};
	@XmlElement(name = "CtrctSttlmMnth")
	protected ISOYearMonth contractSettlementMonth;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ISOYearMonth ISOYearMonth}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmContractSettlementMonth
	 * Security.mmContractSettlementMonth}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1
	 * FutureOrOptionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrctSttlmMnth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractSettlementMonth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies when the contract (i.e. MBS/TBA) will settle."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FutureOrOptionDetails1, Optional<ISOYearMonth>> mmContractSettlementMonth = new MMMessageAttribute<FutureOrOptionDetails1, Optional<ISOYearMonth>>() {
		{
			businessElementTrace_lazy = () -> Security.mmContractSettlementMonth;
			componentContext_lazy = () -> com.tools20022.repository.msg.FutureOrOptionDetails1.mmObject();
			isDerived = false;
			xmlTag = "CtrctSttlmMnth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractSettlementMonth";
			definition = "Specifies when the contract (i.e. MBS/TBA) will settle.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISOYearMonth.mmObject();
		}

		@Override
		public Optional<ISOYearMonth> getValue(FutureOrOptionDetails1 obj) {
			return obj.getContractSettlementMonth();
		}

		@Override
		public void setValue(FutureOrOptionDetails1 obj, Optional<ISOYearMonth> value) {
			obj.setContractSettlementMonth(value.orElse(null));
		}
	};
	@XmlElement(name = "FrstDealgDt")
	protected DateAndDateTime1Choice firstDealingDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTime1Choice
	 * DateAndDateTime1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmFirstDealingDate
	 * Security.mmFirstDealingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1
	 * FutureOrOptionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrstDealgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstDealingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which new securities begin trading."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FutureOrOptionDetails1, Optional<DateAndDateTime1Choice>> mmFirstDealingDate = new MMMessageAssociationEnd<FutureOrOptionDetails1, Optional<DateAndDateTime1Choice>>() {
		{
			businessElementTrace_lazy = () -> Security.mmFirstDealingDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.FutureOrOptionDetails1.mmObject();
			isDerived = false;
			xmlTag = "FrstDealgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstDealingDate";
			definition = "Date on which new securities begin trading.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateAndDateTime1Choice.mmObject();
		}

		@Override
		public Optional<DateAndDateTime1Choice> getValue(FutureOrOptionDetails1 obj) {
			return obj.getFirstDealingDate();
		}

		@Override
		public void setValue(FutureOrOptionDetails1 obj, Optional<DateAndDateTime1Choice> value) {
			obj.setFirstDealingDate(value.orElse(null));
		}
	};
	@XmlElement(name = "Ratio")
	protected List<UnderlyingRatio1> ratio;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.UnderlyingRatio1
	 * UnderlyingRatio1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmRatio
	 * SecuritiesConversion.mmRatio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1
	 * FutureOrOptionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ratio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Ratio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Ratio applied to convert the related security."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FutureOrOptionDetails1, List<UnderlyingRatio1>> mmRatio = new MMMessageAssociationEnd<FutureOrOptionDetails1, List<UnderlyingRatio1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesConversion.mmRatio;
			componentContext_lazy = () -> com.tools20022.repository.msg.FutureOrOptionDetails1.mmObject();
			isDerived = false;
			xmlTag = "Ratio";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Ratio";
			definition = "Ratio applied to convert the related security.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UnderlyingRatio1.mmObject();
		}

		@Override
		public List<UnderlyingRatio1> getValue(FutureOrOptionDetails1 obj) {
			return obj.getRatio();
		}

		@Override
		public void setValue(FutureOrOptionDetails1 obj, List<UnderlyingRatio1> value) {
			obj.setRatio(value);
		}
	};
	@XmlElement(name = "Ratg")
	protected List<Rating1> rating;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Rating1 Rating1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmRating
	 * Security.mmRating}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1
	 * FutureOrOptionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ratg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rating"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rating(s) of the security."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FutureOrOptionDetails1, List<Rating1>> mmRating = new MMMessageAssociationEnd<FutureOrOptionDetails1, List<Rating1>>() {
		{
			businessElementTrace_lazy = () -> Security.mmRating;
			componentContext_lazy = () -> com.tools20022.repository.msg.FutureOrOptionDetails1.mmObject();
			isDerived = false;
			xmlTag = "Ratg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rating";
			definition = "Rating(s) of the security.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Rating1.mmObject();
		}

		@Override
		public List<Rating1> getValue(FutureOrOptionDetails1 obj) {
			return obj.getRating();
		}

		@Override
		public void setValue(FutureOrOptionDetails1 obj, List<Rating1> value) {
			obj.setRating(value);
		}
	};
	@XmlElement(name = "IssePric")
	protected Price4 issuePrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Price4 Price4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmIssuePrice
	 * Issuance.mmIssuePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1
	 * FutureOrOptionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssePric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Initial issue price of a financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FutureOrOptionDetails1, Optional<Price4>> mmIssuePrice = new MMMessageAssociationEnd<FutureOrOptionDetails1, Optional<Price4>>() {
		{
			businessElementTrace_lazy = () -> Issuance.mmIssuePrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.FutureOrOptionDetails1.mmObject();
			isDerived = false;
			xmlTag = "IssePric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuePrice";
			definition = "Initial issue price of a financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Price4.mmObject();
		}

		@Override
		public Optional<Price4> getValue(FutureOrOptionDetails1 obj) {
			return obj.getIssuePrice();
		}

		@Override
		public void setValue(FutureOrOptionDetails1 obj, Optional<Price4> value) {
			obj.setIssuePrice(value.orElse(null));
		}
	};
	@XmlElement(name = "OptnRghts")
	protected OptionRight1Choice optionRights;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.OptionRight1Choice
	 * OptionRight1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1
	 * FutureOrOptionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnRghts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionRights"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rights to exercise the privilege to purchase or to sell the assets specified at a predetermined price or formula at or within a time in the future."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FutureOrOptionDetails1, Optional<OptionRight1Choice>> mmOptionRights = new MMMessageAttribute<FutureOrOptionDetails1, Optional<OptionRight1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FutureOrOptionDetails1.mmObject();
			isDerived = false;
			xmlTag = "OptnRghts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionRights";
			definition = "Rights to exercise the privilege to purchase or to sell the assets specified at a predetermined price or formula at or within a time in the future.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> OptionRight1Choice.mmObject();
		}

		@Override
		public Optional<OptionRight1Choice> getValue(FutureOrOptionDetails1 obj) {
			return obj.getOptionRights();
		}

		@Override
		public void setValue(FutureOrOptionDetails1 obj, Optional<OptionRight1Choice> value) {
			obj.setOptionRights(value.orElse(null));
		}
	};
	@XmlElement(name = "LastTx")
	protected YesNoIndicator lastTransaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1
	 * FutureOrOptionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LastTx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LastTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether or not this is the last transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FutureOrOptionDetails1, Optional<YesNoIndicator>> mmLastTransaction = new MMMessageAttribute<FutureOrOptionDetails1, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FutureOrOptionDetails1.mmObject();
			isDerived = false;
			xmlTag = "LastTx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastTransaction";
			definition = "Indicates whether or not this is the last transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(FutureOrOptionDetails1 obj) {
			return obj.getLastTransaction();
		}

		@Override
		public void setValue(FutureOrOptionDetails1 obj, Optional<YesNoIndicator> value) {
			obj.setLastTransaction(value.orElse(null));
		}
	};
	@XmlElement(name = "SprdTx")
	protected YesNoIndicator spreadTransaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmSpreadTransaction
	 * SecuritiesFinancing.mmSpreadTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1
	 * FutureOrOptionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SprdTx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpreadTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that there will be one price and one transaction when two contracts are carried out simultaneously, one to buy and the other one to sell with two different expiration dates."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FutureOrOptionDetails1, Optional<YesNoIndicator>> mmSpreadTransaction = new MMMessageAttribute<FutureOrOptionDetails1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmSpreadTransaction;
			componentContext_lazy = () -> com.tools20022.repository.msg.FutureOrOptionDetails1.mmObject();
			isDerived = false;
			xmlTag = "SprdTx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpreadTransaction";
			definition = "Specifies that there will be one price and one transaction when two contracts are carried out simultaneously, one to buy and the other one to sell with two different expiration dates.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(FutureOrOptionDetails1 obj) {
			return obj.getSpreadTransaction();
		}

		@Override
		public void setValue(FutureOrOptionDetails1 obj, Optional<YesNoIndicator> value) {
			obj.setSpreadTransaction(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FutureOrOptionDetails1.mmFutureAndOptionContractType, com.tools20022.repository.msg.FutureOrOptionDetails1.mmLastDeliveryDate,
						com.tools20022.repository.msg.FutureOrOptionDetails1.mmUnitOfMeasure, com.tools20022.repository.msg.FutureOrOptionDetails1.mmFutureDate, com.tools20022.repository.msg.FutureOrOptionDetails1.mmMinimumSize,
						com.tools20022.repository.msg.FutureOrOptionDetails1.mmAnnouncementDate, com.tools20022.repository.msg.FutureOrOptionDetails1.mmAppearance, com.tools20022.repository.msg.FutureOrOptionDetails1.mmStrippableIndicator,
						com.tools20022.repository.msg.FutureOrOptionDetails1.mmPositionLimit, com.tools20022.repository.msg.FutureOrOptionDetails1.mmNearTermPositionLimit,
						com.tools20022.repository.msg.FutureOrOptionDetails1.mmMinimumTradingPricingIncrement, com.tools20022.repository.msg.FutureOrOptionDetails1.mmPurpose,
						com.tools20022.repository.msg.FutureOrOptionDetails1.mmContractSettlementMonth, com.tools20022.repository.msg.FutureOrOptionDetails1.mmFirstDealingDate, com.tools20022.repository.msg.FutureOrOptionDetails1.mmRatio,
						com.tools20022.repository.msg.FutureOrOptionDetails1.mmRating, com.tools20022.repository.msg.FutureOrOptionDetails1.mmIssuePrice, com.tools20022.repository.msg.FutureOrOptionDetails1.mmOptionRights,
						com.tools20022.repository.msg.FutureOrOptionDetails1.mmLastTransaction, com.tools20022.repository.msg.FutureOrOptionDetails1.mmSpreadTransaction);
				trace_lazy = () -> Derivative.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FutureOrOptionDetails1";
				definition = "Parameters for contracts which obligate the buyer to receive and the seller to deliver in the future the assets specified at an agreed price or contracts which grant to the holder either the privilege to purchase or the privilege to sell the assets specified at a predetermined price or formula at or within a time in the future.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<FutureAndOptionContractType1Code> getFutureAndOptionContractType() {
		return futureAndOptionContractType == null ? Optional.empty() : Optional.of(futureAndOptionContractType);
	}

	public FutureOrOptionDetails1 setFutureAndOptionContractType(FutureAndOptionContractType1Code futureAndOptionContractType) {
		this.futureAndOptionContractType = futureAndOptionContractType;
		return this;
	}

	public Optional<ISODateTime> getLastDeliveryDate() {
		return lastDeliveryDate == null ? Optional.empty() : Optional.of(lastDeliveryDate);
	}

	public FutureOrOptionDetails1 setLastDeliveryDate(ISODateTime lastDeliveryDate) {
		this.lastDeliveryDate = lastDeliveryDate;
		return this;
	}

	public Optional<UnitOfMeasure1Code> getUnitOfMeasure() {
		return unitOfMeasure == null ? Optional.empty() : Optional.of(unitOfMeasure);
	}

	public FutureOrOptionDetails1 setUnitOfMeasure(UnitOfMeasure1Code unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
		return this;
	}

	public Optional<ISODateTime> getFutureDate() {
		return futureDate == null ? Optional.empty() : Optional.of(futureDate);
	}

	public FutureOrOptionDetails1 setFutureDate(ISODateTime futureDate) {
		this.futureDate = futureDate;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getMinimumSize() {
		return minimumSize == null ? Optional.empty() : Optional.of(minimumSize);
	}

	public FutureOrOptionDetails1 setMinimumSize(ActiveCurrencyAndAmount minimumSize) {
		this.minimumSize = minimumSize;
		return this;
	}

	public Optional<ISODateTime> getAnnouncementDate() {
		return announcementDate == null ? Optional.empty() : Optional.of(announcementDate);
	}

	public FutureOrOptionDetails1 setAnnouncementDate(ISODateTime announcementDate) {
		this.announcementDate = announcementDate;
		return this;
	}

	public Optional<Appearance1Code> getAppearance() {
		return appearance == null ? Optional.empty() : Optional.of(appearance);
	}

	public FutureOrOptionDetails1 setAppearance(Appearance1Code appearance) {
		this.appearance = appearance;
		return this;
	}

	public Optional<YesNoIndicator> getStrippableIndicator() {
		return strippableIndicator == null ? Optional.empty() : Optional.of(strippableIndicator);
	}

	public FutureOrOptionDetails1 setStrippableIndicator(YesNoIndicator strippableIndicator) {
		this.strippableIndicator = strippableIndicator;
		return this;
	}

	public Optional<Number> getPositionLimit() {
		return positionLimit == null ? Optional.empty() : Optional.of(positionLimit);
	}

	public FutureOrOptionDetails1 setPositionLimit(Number positionLimit) {
		this.positionLimit = positionLimit;
		return this;
	}

	public Optional<Number> getNearTermPositionLimit() {
		return nearTermPositionLimit == null ? Optional.empty() : Optional.of(nearTermPositionLimit);
	}

	public FutureOrOptionDetails1 setNearTermPositionLimit(Number nearTermPositionLimit) {
		this.nearTermPositionLimit = nearTermPositionLimit;
		return this;
	}

	public Optional<Number> getMinimumTradingPricingIncrement() {
		return minimumTradingPricingIncrement == null ? Optional.empty() : Optional.of(minimumTradingPricingIncrement);
	}

	public FutureOrOptionDetails1 setMinimumTradingPricingIncrement(Number minimumTradingPricingIncrement) {
		this.minimumTradingPricingIncrement = minimumTradingPricingIncrement;
		return this;
	}

	public Optional<Max256Text> getPurpose() {
		return purpose == null ? Optional.empty() : Optional.of(purpose);
	}

	public FutureOrOptionDetails1 setPurpose(Max256Text purpose) {
		this.purpose = purpose;
		return this;
	}

	public Optional<ISOYearMonth> getContractSettlementMonth() {
		return contractSettlementMonth == null ? Optional.empty() : Optional.of(contractSettlementMonth);
	}

	public FutureOrOptionDetails1 setContractSettlementMonth(ISOYearMonth contractSettlementMonth) {
		this.contractSettlementMonth = contractSettlementMonth;
		return this;
	}

	public Optional<DateAndDateTime1Choice> getFirstDealingDate() {
		return firstDealingDate == null ? Optional.empty() : Optional.of(firstDealingDate);
	}

	public FutureOrOptionDetails1 setFirstDealingDate(DateAndDateTime1Choice firstDealingDate) {
		this.firstDealingDate = firstDealingDate;
		return this;
	}

	public List<UnderlyingRatio1> getRatio() {
		return ratio == null ? ratio = new ArrayList<>() : ratio;
	}

	public FutureOrOptionDetails1 setRatio(List<UnderlyingRatio1> ratio) {
		this.ratio = Objects.requireNonNull(ratio);
		return this;
	}

	public List<Rating1> getRating() {
		return rating == null ? rating = new ArrayList<>() : rating;
	}

	public FutureOrOptionDetails1 setRating(List<Rating1> rating) {
		this.rating = Objects.requireNonNull(rating);
		return this;
	}

	public Optional<Price4> getIssuePrice() {
		return issuePrice == null ? Optional.empty() : Optional.of(issuePrice);
	}

	public FutureOrOptionDetails1 setIssuePrice(Price4 issuePrice) {
		this.issuePrice = issuePrice;
		return this;
	}

	public Optional<OptionRight1Choice> getOptionRights() {
		return optionRights == null ? Optional.empty() : Optional.of(optionRights);
	}

	public FutureOrOptionDetails1 setOptionRights(OptionRight1Choice optionRights) {
		this.optionRights = optionRights;
		return this;
	}

	public Optional<YesNoIndicator> getLastTransaction() {
		return lastTransaction == null ? Optional.empty() : Optional.of(lastTransaction);
	}

	public FutureOrOptionDetails1 setLastTransaction(YesNoIndicator lastTransaction) {
		this.lastTransaction = lastTransaction;
		return this;
	}

	public Optional<YesNoIndicator> getSpreadTransaction() {
		return spreadTransaction == null ? Optional.empty() : Optional.of(spreadTransaction);
	}

	public FutureOrOptionDetails1 setSpreadTransaction(YesNoIndicator spreadTransaction) {
		this.spreadTransaction = spreadTransaction;
		return this;
	}
}