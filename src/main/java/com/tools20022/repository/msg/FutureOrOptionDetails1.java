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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "FutureOrOptionDetails1", propOrder = {"futureAndOptionContractType", "lastDeliveryDate", "unitOfMeasure", "futureDate", "minimumSize", "announcementDate", "appearance", "strippableIndicator", "positionLimit",
		"nearTermPositionLimit", "minimumTradingPricingIncrement", "purpose", "contractSettlementMonth", "firstDealingDate", "ratio", "rating", "issuePrice", "optionRights", "lastTransaction", "spreadTransaction"})
public class FutureOrOptionDetails1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected FutureAndOptionContractType1Code futureAndOptionContractType;
	/**
	 * Specifies the type of the contract for futures and options.
	 * <p>
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
	public static final MMMessageAttribute mmFutureAndOptionContractType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FutureOrOptionDetails1.mmObject();
			isDerived = false;
			xmlTag = "FutrAndOptnCtrctTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FutureAndOptionContractType";
			definition = "Specifies the type of the contract for futures and options.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> FutureAndOptionContractType1Code.mmObject();
		}
	};
	protected ISODateTime lastDeliveryDate;
	/**
	 * Last date/time by which the option for physical delivery may still be
	 * exercised.
	 * <p>
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
	public static final MMMessageAttribute mmLastDeliveryDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Future.mmLastDeliveryDate;
			componentContext_lazy = () -> FutureOrOptionDetails1.mmObject();
			isDerived = false;
			xmlTag = "LastDlvryDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastDeliveryDate";
			definition = "Last date/time by which the option for physical delivery may still be exercised.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected UnitOfMeasure1Code unitOfMeasure;
	/**
	 * Used to indicate the size of the underlying commodity on which the
	 * contract is based (e.g., 2500 lbs of lean cattle, 1000 barrels of crude
	 * oil, 1000 bushels of corn, etc.)
	 * <p>
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
	 * "Used to indicate the size of the underlying commodity on which the contract is based (e.g., 2500 lbs of lean cattle, 1000 barrels of crude oil, 1000 bushels of corn, etc.)"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUnitOfMeasure = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Future.mmUnitOfMeasure;
			componentContext_lazy = () -> FutureOrOptionDetails1.mmObject();
			isDerived = false;
			xmlTag = "UnitOfMeasr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitOfMeasure";
			definition = "Used to indicate the size of the underlying commodity on which the contract is based (e.g., 2500 lbs of lean cattle, 1000 barrels of crude oil, 1000 bushels of corn, etc.)";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> UnitOfMeasure1Code.mmObject();
		}
	};
	protected ISODateTime futureDate;
	/**
	 * Date on which future contracts settle.
	 * <p>
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
	public static final MMMessageAttribute mmFutureDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Future.mmFutureDate;
			componentContext_lazy = () -> FutureOrOptionDetails1.mmObject();
			isDerived = false;
			xmlTag = "FutrDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FutureDate";
			definition = "Date on which future contracts settle.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount minimumSize;
	/**
	 * Specifies the minimum ratio or multiply factor used to convert from
	 * contracts to shares.
	 * <p>
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
	public static final MMMessageAttribute mmMinimumSize = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Future.mmMinimumSize;
			componentContext_lazy = () -> FutureOrOptionDetails1.mmObject();
			isDerived = false;
			xmlTag = "MinSz";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumSize";
			definition = "Specifies the minimum ratio or multiply factor used to convert from contracts to shares.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ISODateTime announcementDate;
	/**
	 * Date/time, as announced by the issuer, at which the securities will be
	 * issued.
	 * <p>
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
	public static final MMMessageAttribute mmAnnouncementDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Issuance.mmIssueDate;
			componentContext_lazy = () -> FutureOrOptionDetails1.mmObject();
			isDerived = false;
			xmlTag = "AnncmntDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnnouncementDate";
			definition = "Date/time, as announced by the issuer, at which the securities will be issued.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected Appearance1Code appearance;
	/**
	 * Specifies the deliverability of a security.
	 * <p>
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
	public static final MMMessageAttribute mmAppearance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmAppearance;
			componentContext_lazy = () -> FutureOrOptionDetails1.mmObject();
			isDerived = false;
			xmlTag = "Apprnc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Appearance";
			definition = "Specifies the deliverability of a security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Appearance1Code.mmObject();
		}
	};
	protected YesNoIndicator strippableIndicator;
	/**
	 * Indicates whether the interest is separable from the principal.
	 * <p>
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
	public static final MMMessageAttribute mmStrippableIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmStrippableIndicator;
			componentContext_lazy = () -> FutureOrOptionDetails1.mmObject();
			isDerived = false;
			xmlTag = "StrpblInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StrippableIndicator";
			definition = "Indicates whether the interest is separable from the principal.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected Number positionLimit;
	/**
	 * Indicates the maximum number of listed option contracts on a single
	 * security which can be held by an investor or group of investors acting
	 * jointly.
	 * <p>
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
	public static final MMMessageAttribute mmPositionLimit = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Option.mmPositionLimit;
			componentContext_lazy = () -> FutureOrOptionDetails1.mmObject();
			isDerived = false;
			xmlTag = "PosLmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PositionLimit";
			definition = "Indicates the maximum number of listed option contracts on a single security which can be held by an investor or group of investors acting jointly.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Number nearTermPositionLimit;
	/**
	 * Position limit in the near-term contract for a given exchange-traded
	 * product.
	 * <p>
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
	public static final MMMessageAttribute mmNearTermPositionLimit = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmNearTermPositionLimit;
			componentContext_lazy = () -> FutureOrOptionDetails1.mmObject();
			isDerived = false;
			xmlTag = "NearTermPosLmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NearTermPositionLimit";
			definition = "Position limit in the near-term contract for a given exchange-traded product.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Number minimumTradingPricingIncrement;
	/**
	 * Minimum price increase for a given exchange-traded Instrument
	 * <p>
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
	 * "Minimum price increase for a given exchange-traded Instrument"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMinimumTradingPricingIncrement = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmMinimumTradingPricingIncrement;
			componentContext_lazy = () -> FutureOrOptionDetails1.mmObject();
			isDerived = false;
			xmlTag = "MinTradgPricgIncrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumTradingPricingIncrement";
			definition = "Minimum price increase for a given exchange-traded Instrument";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Max256Text purpose;
	/**
	 * Reason for which money is raised through the issuance of a security.
	 * <p>
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
	public static final MMMessageAttribute mmPurpose = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Issuance.mmPurpose;
			componentContext_lazy = () -> FutureOrOptionDetails1.mmObject();
			isDerived = false;
			xmlTag = "Purp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Purpose";
			definition = "Reason for which money is raised through the issuance of a security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max256Text.mmObject();
		}
	};
	protected ISOYearMonth contractSettlementMonth;
	/**
	 * Specifies when the contract (i.e. MBS/TBA) will settle.
	 * <p>
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
	public static final MMMessageAttribute mmContractSettlementMonth = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmContractSettlementMonth;
			componentContext_lazy = () -> FutureOrOptionDetails1.mmObject();
			isDerived = false;
			xmlTag = "CtrctSttlmMnth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractSettlementMonth";
			definition = "Specifies when the contract (i.e. MBS/TBA) will settle.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISOYearMonth.mmObject();
		}
	};
	protected DateAndDateTime1Choice firstDealingDate;
	/**
	 * Date on which new securities begin trading.
	 * <p>
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
	public static final MMMessageAssociationEnd mmFirstDealingDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmFirstDealingDate;
			componentContext_lazy = () -> FutureOrOptionDetails1.mmObject();
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
	};
	protected List<com.tools20022.repository.msg.UnderlyingRatio1> ratio;
	/**
	 * Ratio applied to convert the related security.
	 * <p>
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
	public static final MMMessageAssociationEnd mmRatio = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesConversion.mmRatio;
			componentContext_lazy = () -> FutureOrOptionDetails1.mmObject();
			isDerived = false;
			xmlTag = "Ratio";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Ratio";
			definition = "Ratio applied to convert the related security.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.UnderlyingRatio1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Rating1> rating;
	/**
	 * Rating(s) of the security.
	 * <p>
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
	public static final MMMessageAssociationEnd mmRating = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmRating;
			componentContext_lazy = () -> FutureOrOptionDetails1.mmObject();
			isDerived = false;
			xmlTag = "Ratg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rating";
			definition = "Rating(s) of the security.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Rating1.mmObject();
		}
	};
	protected Price4 issuePrice;
	/**
	 * Initial issue price of a financial instrument.
	 * <p>
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
	public static final MMMessageAssociationEnd mmIssuePrice = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Issuance.mmIssuePrice;
			componentContext_lazy = () -> FutureOrOptionDetails1.mmObject();
			isDerived = false;
			xmlTag = "IssePric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuePrice";
			definition = "Initial issue price of a financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Price4.mmObject();
		}
	};
	protected OptionRight1Choice optionRights;
	/**
	 * Rights to exercise the privilege to purchase or to sell the assets
	 * specified at a predetermined price or formula at or within a time in the
	 * future.
	 * <p>
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
	public static final MMMessageAttribute mmOptionRights = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FutureOrOptionDetails1.mmObject();
			isDerived = false;
			xmlTag = "OptnRghts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionRights";
			definition = "Rights to exercise the privilege to purchase or to sell the assets specified at a predetermined price or formula at or within a time in the future.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> OptionRight1Choice.mmObject();
		}
	};
	protected YesNoIndicator lastTransaction;
	/**
	 * Indicates whether or not this is the last transaction.
	 * <p>
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
	public static final MMMessageAttribute mmLastTransaction = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FutureOrOptionDetails1.mmObject();
			isDerived = false;
			xmlTag = "LastTx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastTransaction";
			definition = "Indicates whether or not this is the last transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator spreadTransaction;
	/**
	 * Specifies that there will be one price and one transaction when two
	 * contracts are carried out simultaneously, one to buy and the other one to
	 * sell with two different expiration dates.
	 * <p>
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
	public static final MMMessageAttribute mmSpreadTransaction = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmSpreadTransaction;
			componentContext_lazy = () -> FutureOrOptionDetails1.mmObject();
			isDerived = false;
			xmlTag = "SprdTx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpreadTransaction";
			definition = "Specifies that there will be one price and one transaction when two contracts are carried out simultaneously, one to buy and the other one to sell with two different expiration dates.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(FutureOrOptionDetails1.mmFutureAndOptionContractType, FutureOrOptionDetails1.mmLastDeliveryDate, FutureOrOptionDetails1.mmUnitOfMeasure, FutureOrOptionDetails1.mmFutureDate,
						FutureOrOptionDetails1.mmMinimumSize, FutureOrOptionDetails1.mmAnnouncementDate, FutureOrOptionDetails1.mmAppearance, FutureOrOptionDetails1.mmStrippableIndicator, FutureOrOptionDetails1.mmPositionLimit,
						FutureOrOptionDetails1.mmNearTermPositionLimit, FutureOrOptionDetails1.mmMinimumTradingPricingIncrement, FutureOrOptionDetails1.mmPurpose, FutureOrOptionDetails1.mmContractSettlementMonth,
						FutureOrOptionDetails1.mmFirstDealingDate, FutureOrOptionDetails1.mmRatio, FutureOrOptionDetails1.mmRating, FutureOrOptionDetails1.mmIssuePrice, FutureOrOptionDetails1.mmOptionRights,
						FutureOrOptionDetails1.mmLastTransaction, FutureOrOptionDetails1.mmSpreadTransaction);
				trace_lazy = () -> Derivative.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FutureOrOptionDetails1";
				definition = "Parameters for contracts which obligate the buyer to receive and the seller to deliver in the future the assets specified at an agreed price or contracts which grant to the holder either the privilege to purchase or the privilege to sell the assets specified at a predetermined price or formula at or within a time in the future.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "FutrAndOptnCtrctTp")
	public FutureAndOptionContractType1Code getFutureAndOptionContractType() {
		return futureAndOptionContractType;
	}

	public void setFutureAndOptionContractType(FutureAndOptionContractType1Code futureAndOptionContractType) {
		this.futureAndOptionContractType = futureAndOptionContractType;
	}

	@XmlElement(name = "LastDlvryDt")
	public ISODateTime getLastDeliveryDate() {
		return lastDeliveryDate;
	}

	public void setLastDeliveryDate(ISODateTime lastDeliveryDate) {
		this.lastDeliveryDate = lastDeliveryDate;
	}

	@XmlElement(name = "UnitOfMeasr")
	public UnitOfMeasure1Code getUnitOfMeasure() {
		return unitOfMeasure;
	}

	public void setUnitOfMeasure(UnitOfMeasure1Code unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}

	@XmlElement(name = "FutrDt")
	public ISODateTime getFutureDate() {
		return futureDate;
	}

	public void setFutureDate(ISODateTime futureDate) {
		this.futureDate = futureDate;
	}

	@XmlElement(name = "MinSz")
	public ActiveCurrencyAndAmount getMinimumSize() {
		return minimumSize;
	}

	public void setMinimumSize(ActiveCurrencyAndAmount minimumSize) {
		this.minimumSize = minimumSize;
	}

	@XmlElement(name = "AnncmntDt")
	public ISODateTime getAnnouncementDate() {
		return announcementDate;
	}

	public void setAnnouncementDate(ISODateTime announcementDate) {
		this.announcementDate = announcementDate;
	}

	@XmlElement(name = "Apprnc")
	public Appearance1Code getAppearance() {
		return appearance;
	}

	public void setAppearance(Appearance1Code appearance) {
		this.appearance = appearance;
	}

	@XmlElement(name = "StrpblInd")
	public YesNoIndicator getStrippableIndicator() {
		return strippableIndicator;
	}

	public void setStrippableIndicator(YesNoIndicator strippableIndicator) {
		this.strippableIndicator = strippableIndicator;
	}

	@XmlElement(name = "PosLmt")
	public Number getPositionLimit() {
		return positionLimit;
	}

	public void setPositionLimit(Number positionLimit) {
		this.positionLimit = positionLimit;
	}

	@XmlElement(name = "NearTermPosLmt")
	public Number getNearTermPositionLimit() {
		return nearTermPositionLimit;
	}

	public void setNearTermPositionLimit(Number nearTermPositionLimit) {
		this.nearTermPositionLimit = nearTermPositionLimit;
	}

	@XmlElement(name = "MinTradgPricgIncrmt")
	public Number getMinimumTradingPricingIncrement() {
		return minimumTradingPricingIncrement;
	}

	public void setMinimumTradingPricingIncrement(Number minimumTradingPricingIncrement) {
		this.minimumTradingPricingIncrement = minimumTradingPricingIncrement;
	}

	@XmlElement(name = "Purp")
	public Max256Text getPurpose() {
		return purpose;
	}

	public void setPurpose(Max256Text purpose) {
		this.purpose = purpose;
	}

	@XmlElement(name = "CtrctSttlmMnth")
	public ISOYearMonth getContractSettlementMonth() {
		return contractSettlementMonth;
	}

	public void setContractSettlementMonth(ISOYearMonth contractSettlementMonth) {
		this.contractSettlementMonth = contractSettlementMonth;
	}

	@XmlElement(name = "FrstDealgDt")
	public DateAndDateTime1Choice getFirstDealingDate() {
		return firstDealingDate;
	}

	public void setFirstDealingDate(DateAndDateTime1Choice firstDealingDate) {
		this.firstDealingDate = firstDealingDate;
	}

	@XmlElement(name = "Ratio")
	public List<UnderlyingRatio1> getRatio() {
		return ratio;
	}

	public void setRatio(List<com.tools20022.repository.msg.UnderlyingRatio1> ratio) {
		this.ratio = ratio;
	}

	@XmlElement(name = "Ratg")
	public List<Rating1> getRating() {
		return rating;
	}

	public void setRating(List<com.tools20022.repository.msg.Rating1> rating) {
		this.rating = rating;
	}

	@XmlElement(name = "IssePric")
	public Price4 getIssuePrice() {
		return issuePrice;
	}

	public void setIssuePrice(com.tools20022.repository.msg.Price4 issuePrice) {
		this.issuePrice = issuePrice;
	}

	@XmlElement(name = "OptnRghts")
	public OptionRight1Choice getOptionRights() {
		return optionRights;
	}

	public void setOptionRights(OptionRight1Choice optionRights) {
		this.optionRights = optionRights;
	}

	@XmlElement(name = "LastTx")
	public YesNoIndicator getLastTransaction() {
		return lastTransaction;
	}

	public void setLastTransaction(YesNoIndicator lastTransaction) {
		this.lastTransaction = lastTransaction;
	}

	@XmlElement(name = "SprdTx")
	public YesNoIndicator getSpreadTransaction() {
		return spreadTransaction;
	}

	public void setSpreadTransaction(YesNoIndicator spreadTransaction) {
		this.spreadTransaction = spreadTransaction;
	}
}