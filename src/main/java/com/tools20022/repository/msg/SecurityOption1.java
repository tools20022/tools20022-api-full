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
import com.tools20022.repository.choice.FractionDispositionType1FormatChoice;
import com.tools20022.repository.choice.ShareRanking1FormatChoice;
import com.tools20022.repository.choice.UnitOrFaceAmount1Choice;
import com.tools20022.repository.codeset.CreditDebitCode;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides information about the CA security option.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityOption1#mmSecurityIdentification
 * SecurityOption1.mmSecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityOption1#mmCreditDebitIndicator
 * SecurityOption1.mmCreditDebitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityOption1#mmSecuritiesQuantity
 * SecurityOption1.mmSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityOption1#mmMinimumExercisableSecuritiesQuantity
 * SecurityOption1.mmMinimumExercisableSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityOption1#mmMinimumExercisableMultipleSecuritiesQuantity
 * SecurityOption1.mmMinimumExercisableMultipleSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityOption1#mmNewDenominationSecuritiesQuantity
 * SecurityOption1.mmNewDenominationSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityOption1#mmNewBoardLotSecuritiesQuantity
 * SecurityOption1.mmNewBoardLotSecuritiesQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityOption1#mmShareRanking
 * SecurityOption1.mmShareRanking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityOption1#mmAdditionalQuantityForSubscribedResultantSecurities
 * SecurityOption1.mmAdditionalQuantityForSubscribedResultantSecurities}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityOption1#mmDateDetails
 * SecurityOption1.mmDateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityOption1#mmPriceDetails
 * SecurityOption1.mmPriceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityOption1#mmTradingPeriod
 * SecurityOption1.mmTradingPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityOption1#mmAdditionalQuantityForExistingSecurities
 * SecurityOption1.mmAdditionalQuantityForExistingSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityOption1#mmTemporaryFinancialInstrumentIndicator
 * SecurityOption1.mmTemporaryFinancialInstrumentIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityOption1#mmFractionDisposition
 * SecurityOption1.mmFractionDisposition}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionOption
 * CorporateActionOption}</li>
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
 * "SecurityOption1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides information about the CA security option."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecurityOption1", propOrder = {"securityIdentification", "creditDebitIndicator", "securitiesQuantity", "minimumExercisableSecuritiesQuantity", "minimumExercisableMultipleSecuritiesQuantity",
		"newDenominationSecuritiesQuantity", "newBoardLotSecuritiesQuantity", "shareRanking", "additionalQuantityForSubscribedResultantSecurities", "dateDetails", "priceDetails", "tradingPeriod", "additionalQuantityForExistingSecurities",
		"temporaryFinancialInstrumentIndicator", "fractionDisposition"})
public class SecurityOption1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SctyId", required = true)
	protected FinancialInstrumentDescription3 securityIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDescription3
	 * FinancialInstrumentDescription3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityOption1
	 * SecurityOption1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityOption1, FinancialInstrumentDescription3> mmSecurityIdentification = new MMMessageAttribute<SecurityOption1, FinancialInstrumentDescription3>() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityOption1.mmObject();
			isDerived = false;
			xmlTag = "SctyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityIdentification";
			definition = "Identification of the financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> FinancialInstrumentDescription3.mmObject();
		}

		@Override
		public FinancialInstrumentDescription3 getValue(SecurityOption1 obj) {
			return obj.getSecurityIdentification();
		}

		@Override
		public void setValue(SecurityOption1 obj, FinancialInstrumentDescription3 value) {
			obj.setSecurityIdentification(value);
		}
	};
	@XmlElement(name = "CdtDbtInd", required = true)
	protected CreditDebitCode creditDebitIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CreditDebitCode
	 * CreditDebitCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmCreditDebitIndicator
	 * ProceedsDefinition.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityOption1
	 * SecurityOption1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtDbtInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether the value is a debit or credit."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityOption1, CreditDebitCode> mmCreditDebitIndicator = new MMMessageAttribute<SecurityOption1, CreditDebitCode>() {
		{
			businessElementTrace_lazy = () -> ProceedsDefinition.mmCreditDebitIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityOption1.mmObject();
			isDerived = false;
			xmlTag = "CdtDbtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Specifies whether the value is a debit or credit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CreditDebitCode.mmObject();
		}

		@Override
		public CreditDebitCode getValue(SecurityOption1 obj) {
			return obj.getCreditDebitIndicator();
		}

		@Override
		public void setValue(SecurityOption1 obj, CreditDebitCode value) {
			obj.setCreditDebitIndicator(value);
		}
	};
	@XmlElement(name = "SctiesQty")
	protected UnitOrFaceAmount1Choice securitiesQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UnitOrFaceAmount1Choice
	 * UnitOrFaceAmount1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmSecuritiesQuantity
	 * SecuritiesProceedsDefinition.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityOption1
	 * SecurityOption1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityOption1, Optional<UnitOrFaceAmount1Choice>> mmSecuritiesQuantity = new MMMessageAttribute<SecurityOption1, Optional<UnitOrFaceAmount1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmSecuritiesQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityOption1.mmObject();
			isDerived = false;
			xmlTag = "SctiesQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesQuantity";
			definition = "Quantity of financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> UnitOrFaceAmount1Choice.mmObject();
		}

		@Override
		public Optional<UnitOrFaceAmount1Choice> getValue(SecurityOption1 obj) {
			return obj.getSecuritiesQuantity();
		}

		@Override
		public void setValue(SecurityOption1 obj, Optional<UnitOrFaceAmount1Choice> value) {
			obj.setSecuritiesQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "MinExrcblSctiesQty")
	protected UnitOrFaceAmount1Choice minimumExercisableSecuritiesQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UnitOrFaceAmount1Choice
	 * UnitOrFaceAmount1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmMinimumExercisableQuantity
	 * SecuritiesConversion.mmMinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityOption1
	 * SecurityOption1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinExrcblSctiesQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumExercisableSecuritiesQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum quantity of financial instrument or lot of rights/warrants that must be exercised."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityOption1, Optional<UnitOrFaceAmount1Choice>> mmMinimumExercisableSecuritiesQuantity = new MMMessageAttribute<SecurityOption1, Optional<UnitOrFaceAmount1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesConversion.mmMinimumExercisableQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityOption1.mmObject();
			isDerived = false;
			xmlTag = "MinExrcblSctiesQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumExercisableSecuritiesQuantity";
			definition = "Minimum quantity of financial instrument or lot of rights/warrants that must be exercised.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> UnitOrFaceAmount1Choice.mmObject();
		}

		@Override
		public Optional<UnitOrFaceAmount1Choice> getValue(SecurityOption1 obj) {
			return obj.getMinimumExercisableSecuritiesQuantity();
		}

		@Override
		public void setValue(SecurityOption1 obj, Optional<UnitOrFaceAmount1Choice> value) {
			obj.setMinimumExercisableSecuritiesQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "MinExrcblMltplSctiesQty")
	protected UnitOrFaceAmount1Choice minimumExercisableMultipleSecuritiesQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UnitOrFaceAmount1Choice
	 * UnitOrFaceAmount1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmMinimumExercisableMultipleQuantity
	 * SecuritiesConversion.mmMinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityOption1
	 * SecurityOption1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinExrcblMltplSctiesQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumExercisableMultipleSecuritiesQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum multiple quantity of financial instrument or lot of rights/warrants that must be exercised."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityOption1, Optional<UnitOrFaceAmount1Choice>> mmMinimumExercisableMultipleSecuritiesQuantity = new MMMessageAttribute<SecurityOption1, Optional<UnitOrFaceAmount1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesConversion.mmMinimumExercisableMultipleQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityOption1.mmObject();
			isDerived = false;
			xmlTag = "MinExrcblMltplSctiesQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumExercisableMultipleSecuritiesQuantity";
			definition = "Minimum multiple quantity of financial instrument or lot of rights/warrants that must be exercised.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> UnitOrFaceAmount1Choice.mmObject();
		}

		@Override
		public Optional<UnitOrFaceAmount1Choice> getValue(SecurityOption1 obj) {
			return obj.getMinimumExercisableMultipleSecuritiesQuantity();
		}

		@Override
		public void setValue(SecurityOption1 obj, Optional<UnitOrFaceAmount1Choice> value) {
			obj.setMinimumExercisableMultipleSecuritiesQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "NewDnmtnSctiesQty")
	protected UnitOrFaceAmount1Choice newDenominationSecuritiesQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UnitOrFaceAmount1Choice
	 * UnitOrFaceAmount1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmNewDenominationSecuritiesQuantity
	 * SecuritiesProceedsDefinition.mmNewDenominationSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityOption1
	 * SecurityOption1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewDnmtnSctiesQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewDenominationSecuritiesQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "New denomination of the financial instrument following, eg, an increase or decrease in nominal value."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityOption1, Optional<UnitOrFaceAmount1Choice>> mmNewDenominationSecuritiesQuantity = new MMMessageAttribute<SecurityOption1, Optional<UnitOrFaceAmount1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmNewDenominationSecuritiesQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityOption1.mmObject();
			isDerived = false;
			xmlTag = "NewDnmtnSctiesQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewDenominationSecuritiesQuantity";
			definition = "New denomination of the financial instrument following, eg, an increase or decrease in nominal value.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> UnitOrFaceAmount1Choice.mmObject();
		}

		@Override
		public Optional<UnitOrFaceAmount1Choice> getValue(SecurityOption1 obj) {
			return obj.getNewDenominationSecuritiesQuantity();
		}

		@Override
		public void setValue(SecurityOption1 obj, Optional<UnitOrFaceAmount1Choice> value) {
			obj.setNewDenominationSecuritiesQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "NewBrdLotSctiesQty")
	protected UnitOrFaceAmount1Choice newBoardLotSecuritiesQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UnitOrFaceAmount1Choice
	 * UnitOrFaceAmount1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmBoardLotSecuritiesQuantity
	 * SecuritiesProceedsDefinition.mmBoardLotSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityOption1
	 * SecurityOption1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewBrdLotSctiesQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewBoardLotSecuritiesQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of equity that makes up the new board lot."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityOption1, Optional<UnitOrFaceAmount1Choice>> mmNewBoardLotSecuritiesQuantity = new MMMessageAttribute<SecurityOption1, Optional<UnitOrFaceAmount1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmBoardLotSecuritiesQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityOption1.mmObject();
			isDerived = false;
			xmlTag = "NewBrdLotSctiesQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewBoardLotSecuritiesQuantity";
			definition = "Quantity of equity that makes up the new board lot.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> UnitOrFaceAmount1Choice.mmObject();
		}

		@Override
		public Optional<UnitOrFaceAmount1Choice> getValue(SecurityOption1 obj) {
			return obj.getNewBoardLotSecuritiesQuantity();
		}

		@Override
		public void setValue(SecurityOption1 obj, Optional<UnitOrFaceAmount1Choice> value) {
			obj.setNewBoardLotSecuritiesQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "ShrRnkg")
	protected ShareRanking1FormatChoice shareRanking;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ShareRanking1FormatChoice
	 * ShareRanking1FormatChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmShareRanking
	 * SecuritiesProceedsDefinition.mmShareRanking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityOption1
	 * SecurityOption1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShrRnkg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShareRanking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the shares are ranking for dividend or pari passu."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityOption1, Optional<ShareRanking1FormatChoice>> mmShareRanking = new MMMessageAttribute<SecurityOption1, Optional<ShareRanking1FormatChoice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmShareRanking;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityOption1.mmObject();
			isDerived = false;
			xmlTag = "ShrRnkg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShareRanking";
			definition = "Specifies whether the shares are ranking for dividend or pari passu.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ShareRanking1FormatChoice.mmObject();
		}

		@Override
		public Optional<ShareRanking1FormatChoice> getValue(SecurityOption1 obj) {
			return obj.getShareRanking();
		}

		@Override
		public void setValue(SecurityOption1 obj, Optional<ShareRanking1FormatChoice> value) {
			obj.setShareRanking(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlQtyForSbcbdRsltntScties")
	protected QuantityToQuantityRatio1 additionalQuantityForSubscribedResultantSecurities;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.QuantityToQuantityRatio1
	 * QuantityToQuantityRatio1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmAdditionalQuantityForSubscribedResultantSecurities
	 * SecuritiesProceedsDefinition.
	 * mmAdditionalQuantityForSubscribedResultantSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityOption1
	 * SecurityOption1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlQtyForSbcbdRsltntScties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalQuantityForSubscribedResultantSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of additional intermediate securities/new equities awarded for a given quantity of securities derived from subscription."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityOption1, Optional<QuantityToQuantityRatio1>> mmAdditionalQuantityForSubscribedResultantSecurities = new MMMessageAttribute<SecurityOption1, Optional<QuantityToQuantityRatio1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmAdditionalQuantityForSubscribedResultantSecurities;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityOption1.mmObject();
			isDerived = false;
			xmlTag = "AddtlQtyForSbcbdRsltntScties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalQuantityForSubscribedResultantSecurities";
			definition = "Quantity of additional intermediate securities/new equities awarded for a given quantity of securities derived from subscription.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> QuantityToQuantityRatio1.mmObject();
		}

		@Override
		public Optional<QuantityToQuantityRatio1> getValue(SecurityOption1 obj) {
			return obj.getAdditionalQuantityForSubscribedResultantSecurities();
		}

		@Override
		public void setValue(SecurityOption1 obj, Optional<QuantityToQuantityRatio1> value) {
			obj.setAdditionalQuantityForSubscribedResultantSecurities(value.orElse(null));
		}
	};
	@XmlElement(name = "DtDtls")
	protected CorporateActionDate3 dateDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionDate3
	 * CorporateActionDate3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityOption1
	 * SecurityOption1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the dates related to a securities movement."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecurityOption1, Optional<CorporateActionDate3>> mmDateDetails = new MMMessageAssociationEnd<SecurityOption1, Optional<CorporateActionDate3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityOption1.mmObject();
			isDerived = false;
			xmlTag = "DtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateDetails";
			definition = "Provides information about the dates related to a securities movement.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionDate3.mmObject();
		}

		@Override
		public Optional<CorporateActionDate3> getValue(SecurityOption1 obj) {
			return obj.getDateDetails();
		}

		@Override
		public void setValue(SecurityOption1 obj, Optional<CorporateActionDate3> value) {
			obj.setDateDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "PricDtls")
	protected CorporateActionPrice4 priceDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionPrice4
	 * CorporateActionPrice4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionPrice
	 * CorporateActionEvent.mmCorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityOption1
	 * SecurityOption1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the prices related to a securities movement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecurityOption1, Optional<CorporateActionPrice4>> mmPriceDetails = new MMMessageAssociationEnd<SecurityOption1, Optional<CorporateActionPrice4>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmCorporateActionPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityOption1.mmObject();
			isDerived = false;
			xmlTag = "PricDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceDetails";
			definition = "Provides information about the prices related to a securities movement.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionPrice4.mmObject();
		}

		@Override
		public Optional<CorporateActionPrice4> getValue(SecurityOption1 obj) {
			return obj.getPriceDetails();
		}

		@Override
		public void setValue(SecurityOption1 obj, Optional<CorporateActionPrice4> value) {
			obj.setPriceDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "TradgPrd")
	protected Period1 tradingPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Period1 Period1}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmTradingPeriod
	 * CorporateActionEvent.mmTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityOption1
	 * SecurityOption1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which intermediate securities are tradable in a secondary market."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityOption1, Optional<Period1>> mmTradingPeriod = new MMMessageAttribute<SecurityOption1, Optional<Period1>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmTradingPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityOption1.mmObject();
			isDerived = false;
			xmlTag = "TradgPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingPeriod";
			definition = "Period during which intermediate securities are tradable in a secondary market.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Period1.mmObject();
		}

		@Override
		public Optional<Period1> getValue(SecurityOption1 obj) {
			return obj.getTradingPeriod();
		}

		@Override
		public void setValue(SecurityOption1 obj, Optional<Period1> value) {
			obj.setTradingPeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlQtyForExstgScties")
	protected QuantityToQuantityRatio1 additionalQuantityForExistingSecurities;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.QuantityToQuantityRatio1
	 * QuantityToQuantityRatio1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmAdditionalQuantityForExistingSecurities
	 * SecuritiesProceedsDefinition.mmAdditionalQuantityForExistingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityOption1
	 * SecurityOption1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlQtyForExstgScties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalQuantityForExistingSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of additional securities for a given quantity of underlying securities where underlying securities are not exchanged or debited, eg, 1 for 1: 1 new equity credited for every 1 underlying equity = 2 resulting equities."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityOption1, Optional<QuantityToQuantityRatio1>> mmAdditionalQuantityForExistingSecurities = new MMMessageAttribute<SecurityOption1, Optional<QuantityToQuantityRatio1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmAdditionalQuantityForExistingSecurities;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityOption1.mmObject();
			isDerived = false;
			xmlTag = "AddtlQtyForExstgScties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalQuantityForExistingSecurities";
			definition = "Quantity of additional securities for a given quantity of underlying securities where underlying securities are not exchanged or debited, eg, 1 for 1: 1 new equity credited for every 1 underlying equity = 2 resulting equities.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> QuantityToQuantityRatio1.mmObject();
		}

		@Override
		public Optional<QuantityToQuantityRatio1> getValue(SecurityOption1 obj) {
			return obj.getAdditionalQuantityForExistingSecurities();
		}

		@Override
		public void setValue(SecurityOption1 obj, Optional<QuantityToQuantityRatio1> value) {
			obj.setAdditionalQuantityForExistingSecurities(value.orElse(null));
		}
	};
	@XmlElement(name = "TempFinInstrmInd")
	protected YesNoIndicator temporaryFinancialInstrumentIndicator;
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
	 * {@linkplain com.tools20022.repository.entity.Security#mmTemporaryFinancialInstrumentIndicator
	 * Security.mmTemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityOption1
	 * SecurityOption1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TempFinInstrmInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TemporaryFinancialInstrumentIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies that the security is a temporary security."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityOption1, Optional<YesNoIndicator>> mmTemporaryFinancialInstrumentIndicator = new MMMessageAttribute<SecurityOption1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Security.mmTemporaryFinancialInstrumentIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityOption1.mmObject();
			isDerived = false;
			xmlTag = "TempFinInstrmInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TemporaryFinancialInstrumentIndicator";
			definition = "Specifies that the security is a temporary security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SecurityOption1 obj) {
			return obj.getTemporaryFinancialInstrumentIndicator();
		}

		@Override
		public void setValue(SecurityOption1 obj, Optional<YesNoIndicator> value) {
			obj.setTemporaryFinancialInstrumentIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "FrctnDspstn")
	protected FractionDispositionType1FormatChoice fractionDisposition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType1FormatChoice
	 * FractionDispositionType1FormatChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmFractionDisposition
	 * CorporateActionOption.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityOption1
	 * SecurityOption1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrctnDspstn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FractionDisposition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies how fractions resulting from derived securities will be processed or how prorated decisions will be rounding, if provided with a pro ration rate."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityOption1, Optional<FractionDispositionType1FormatChoice>> mmFractionDisposition = new MMMessageAttribute<SecurityOption1, Optional<FractionDispositionType1FormatChoice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmFractionDisposition;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityOption1.mmObject();
			isDerived = false;
			xmlTag = "FrctnDspstn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FractionDisposition";
			definition = "Specifies how fractions resulting from derived securities will be processed or how prorated decisions will be rounding, if provided with a pro ration rate.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FractionDispositionType1FormatChoice.mmObject();
		}

		@Override
		public Optional<FractionDispositionType1FormatChoice> getValue(SecurityOption1 obj) {
			return obj.getFractionDisposition();
		}

		@Override
		public void setValue(SecurityOption1 obj, Optional<FractionDispositionType1FormatChoice> value) {
			obj.setFractionDisposition(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecurityOption1.mmSecurityIdentification, com.tools20022.repository.msg.SecurityOption1.mmCreditDebitIndicator,
						com.tools20022.repository.msg.SecurityOption1.mmSecuritiesQuantity, com.tools20022.repository.msg.SecurityOption1.mmMinimumExercisableSecuritiesQuantity,
						com.tools20022.repository.msg.SecurityOption1.mmMinimumExercisableMultipleSecuritiesQuantity, com.tools20022.repository.msg.SecurityOption1.mmNewDenominationSecuritiesQuantity,
						com.tools20022.repository.msg.SecurityOption1.mmNewBoardLotSecuritiesQuantity, com.tools20022.repository.msg.SecurityOption1.mmShareRanking,
						com.tools20022.repository.msg.SecurityOption1.mmAdditionalQuantityForSubscribedResultantSecurities, com.tools20022.repository.msg.SecurityOption1.mmDateDetails,
						com.tools20022.repository.msg.SecurityOption1.mmPriceDetails, com.tools20022.repository.msg.SecurityOption1.mmTradingPeriod, com.tools20022.repository.msg.SecurityOption1.mmAdditionalQuantityForExistingSecurities,
						com.tools20022.repository.msg.SecurityOption1.mmTemporaryFinancialInstrumentIndicator, com.tools20022.repository.msg.SecurityOption1.mmFractionDisposition);
				trace_lazy = () -> CorporateActionOption.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecurityOption1";
				definition = "Provides information about the CA security option.";
			}
		});
		return mmObject_lazy.get();
	}

	public FinancialInstrumentDescription3 getSecurityIdentification() {
		return securityIdentification;
	}

	public SecurityOption1 setSecurityIdentification(FinancialInstrumentDescription3 securityIdentification) {
		this.securityIdentification = Objects.requireNonNull(securityIdentification);
		return this;
	}

	public CreditDebitCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public SecurityOption1 setCreditDebitIndicator(CreditDebitCode creditDebitIndicator) {
		this.creditDebitIndicator = Objects.requireNonNull(creditDebitIndicator);
		return this;
	}

	public Optional<UnitOrFaceAmount1Choice> getSecuritiesQuantity() {
		return securitiesQuantity == null ? Optional.empty() : Optional.of(securitiesQuantity);
	}

	public SecurityOption1 setSecuritiesQuantity(UnitOrFaceAmount1Choice securitiesQuantity) {
		this.securitiesQuantity = securitiesQuantity;
		return this;
	}

	public Optional<UnitOrFaceAmount1Choice> getMinimumExercisableSecuritiesQuantity() {
		return minimumExercisableSecuritiesQuantity == null ? Optional.empty() : Optional.of(minimumExercisableSecuritiesQuantity);
	}

	public SecurityOption1 setMinimumExercisableSecuritiesQuantity(UnitOrFaceAmount1Choice minimumExercisableSecuritiesQuantity) {
		this.minimumExercisableSecuritiesQuantity = minimumExercisableSecuritiesQuantity;
		return this;
	}

	public Optional<UnitOrFaceAmount1Choice> getMinimumExercisableMultipleSecuritiesQuantity() {
		return minimumExercisableMultipleSecuritiesQuantity == null ? Optional.empty() : Optional.of(minimumExercisableMultipleSecuritiesQuantity);
	}

	public SecurityOption1 setMinimumExercisableMultipleSecuritiesQuantity(UnitOrFaceAmount1Choice minimumExercisableMultipleSecuritiesQuantity) {
		this.minimumExercisableMultipleSecuritiesQuantity = minimumExercisableMultipleSecuritiesQuantity;
		return this;
	}

	public Optional<UnitOrFaceAmount1Choice> getNewDenominationSecuritiesQuantity() {
		return newDenominationSecuritiesQuantity == null ? Optional.empty() : Optional.of(newDenominationSecuritiesQuantity);
	}

	public SecurityOption1 setNewDenominationSecuritiesQuantity(UnitOrFaceAmount1Choice newDenominationSecuritiesQuantity) {
		this.newDenominationSecuritiesQuantity = newDenominationSecuritiesQuantity;
		return this;
	}

	public Optional<UnitOrFaceAmount1Choice> getNewBoardLotSecuritiesQuantity() {
		return newBoardLotSecuritiesQuantity == null ? Optional.empty() : Optional.of(newBoardLotSecuritiesQuantity);
	}

	public SecurityOption1 setNewBoardLotSecuritiesQuantity(UnitOrFaceAmount1Choice newBoardLotSecuritiesQuantity) {
		this.newBoardLotSecuritiesQuantity = newBoardLotSecuritiesQuantity;
		return this;
	}

	public Optional<ShareRanking1FormatChoice> getShareRanking() {
		return shareRanking == null ? Optional.empty() : Optional.of(shareRanking);
	}

	public SecurityOption1 setShareRanking(ShareRanking1FormatChoice shareRanking) {
		this.shareRanking = shareRanking;
		return this;
	}

	public Optional<QuantityToQuantityRatio1> getAdditionalQuantityForSubscribedResultantSecurities() {
		return additionalQuantityForSubscribedResultantSecurities == null ? Optional.empty() : Optional.of(additionalQuantityForSubscribedResultantSecurities);
	}

	public SecurityOption1 setAdditionalQuantityForSubscribedResultantSecurities(QuantityToQuantityRatio1 additionalQuantityForSubscribedResultantSecurities) {
		this.additionalQuantityForSubscribedResultantSecurities = additionalQuantityForSubscribedResultantSecurities;
		return this;
	}

	public Optional<CorporateActionDate3> getDateDetails() {
		return dateDetails == null ? Optional.empty() : Optional.of(dateDetails);
	}

	public SecurityOption1 setDateDetails(CorporateActionDate3 dateDetails) {
		this.dateDetails = dateDetails;
		return this;
	}

	public Optional<CorporateActionPrice4> getPriceDetails() {
		return priceDetails == null ? Optional.empty() : Optional.of(priceDetails);
	}

	public SecurityOption1 setPriceDetails(CorporateActionPrice4 priceDetails) {
		this.priceDetails = priceDetails;
		return this;
	}

	public Optional<Period1> getTradingPeriod() {
		return tradingPeriod == null ? Optional.empty() : Optional.of(tradingPeriod);
	}

	public SecurityOption1 setTradingPeriod(Period1 tradingPeriod) {
		this.tradingPeriod = tradingPeriod;
		return this;
	}

	public Optional<QuantityToQuantityRatio1> getAdditionalQuantityForExistingSecurities() {
		return additionalQuantityForExistingSecurities == null ? Optional.empty() : Optional.of(additionalQuantityForExistingSecurities);
	}

	public SecurityOption1 setAdditionalQuantityForExistingSecurities(QuantityToQuantityRatio1 additionalQuantityForExistingSecurities) {
		this.additionalQuantityForExistingSecurities = additionalQuantityForExistingSecurities;
		return this;
	}

	public Optional<YesNoIndicator> getTemporaryFinancialInstrumentIndicator() {
		return temporaryFinancialInstrumentIndicator == null ? Optional.empty() : Optional.of(temporaryFinancialInstrumentIndicator);
	}

	public SecurityOption1 setTemporaryFinancialInstrumentIndicator(YesNoIndicator temporaryFinancialInstrumentIndicator) {
		this.temporaryFinancialInstrumentIndicator = temporaryFinancialInstrumentIndicator;
		return this;
	}

	public Optional<FractionDispositionType1FormatChoice> getFractionDisposition() {
		return fractionDisposition == null ? Optional.empty() : Optional.of(fractionDisposition);
	}

	public SecurityOption1 setFractionDisposition(FractionDispositionType1FormatChoice fractionDisposition) {
		this.fractionDisposition = fractionDisposition;
		return this;
	}
}