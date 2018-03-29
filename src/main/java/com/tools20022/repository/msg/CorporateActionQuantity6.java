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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.FinancialInstrumentQuantity21Choice;
import com.tools20022.repository.choice.FinancialInstrumentQuantity22Choice;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies corporate action quantities.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity6#mmMinimumExercisableQuantity
 * CorporateActionQuantity6.mmMinimumExercisableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity6#mmMinimumExercisableMultipleQuantity
 * CorporateActionQuantity6.mmMinimumExercisableMultipleQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity6#mmMaximumQuantity
 * CorporateActionQuantity6.mmMaximumQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity6#mmMinimumQuantitySought
 * CorporateActionQuantity6.mmMinimumQuantitySought}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity6#mmNewBoardLotQuantity
 * CorporateActionQuantity6.mmNewBoardLotQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity6#mmNewDenominationQuantity
 * CorporateActionQuantity6.mmNewDenominationQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity6#mmBaseDenomination
 * CorporateActionQuantity6.mmBaseDenomination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity6#mmIncrementalDenomination
 * CorporateActionQuantity6.mmIncrementalDenomination}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionEvent
 * CorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forCorporateActionQuantity6
 * ConstraintCoexistenceQuantityRule.forCorporateActionQuantity6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintMinimumExercisableQuantityRule#forCorporateActionQuantity6
 * ConstraintMinimumExercisableQuantityRule.forCorporateActionQuantity6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintMaximumAndMinimumQuantitySoughtUsageRule#forCorporateActionQuantity6
 * ConstraintMaximumAndMinimumQuantitySoughtUsageRule.
 * forCorporateActionQuantity6}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionQuantity6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies corporate action quantities."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionQuantity6", propOrder = {"minimumExercisableQuantity", "minimumExercisableMultipleQuantity", "maximumQuantity", "minimumQuantitySought", "newBoardLotQuantity", "newDenominationQuantity", "baseDenomination",
		"incrementalDenomination"})
public class CorporateActionQuantity6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MinExrcblQty")
	protected FinancialInstrumentQuantity21Choice minimumExercisableQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity21Choice
	 * FinancialInstrumentQuantity21Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmMinimumExercisableQuantity
	 * SecuritiesConversion.mmMinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity6
	 * CorporateActionQuantity6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinExrcblQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :36B::MIEX</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumExercisableQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum quantity (or lot) of financial instrument that may be exercised or tendered."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionQuantity6, Optional<FinancialInstrumentQuantity21Choice>> mmMinimumExercisableQuantity = new MMMessageAssociationEnd<CorporateActionQuantity6, Optional<FinancialInstrumentQuantity21Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesConversion.mmMinimumExercisableQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionQuantity6.mmObject();
			isDerived = false;
			xmlTag = "MinExrcblQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::MIEX"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumExercisableQuantity";
			definition = "Minimum quantity (or lot) of financial instrument that may be exercised or tendered.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity21Choice.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity21Choice> getValue(CorporateActionQuantity6 obj) {
			return obj.getMinimumExercisableQuantity();
		}

		@Override
		public void setValue(CorporateActionQuantity6 obj, Optional<FinancialInstrumentQuantity21Choice> value) {
			obj.setMinimumExercisableQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "MinExrcblMltplQty")
	protected FinancialInstrumentQuantity22Choice minimumExercisableMultipleQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity22Choice
	 * FinancialInstrumentQuantity22Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmMinimumExercisableMultipleQuantity
	 * SecuritiesConversion.mmMinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity6
	 * CorporateActionQuantity6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinExrcblMltplQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :36B::MILT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumExercisableMultipleQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum multiple quantity (or lot) of financial instrument that may be exercised or tendered."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionQuantity6, Optional<FinancialInstrumentQuantity22Choice>> mmMinimumExercisableMultipleQuantity = new MMMessageAssociationEnd<CorporateActionQuantity6, Optional<FinancialInstrumentQuantity22Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesConversion.mmMinimumExercisableMultipleQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionQuantity6.mmObject();
			isDerived = false;
			xmlTag = "MinExrcblMltplQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::MILT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumExercisableMultipleQuantity";
			definition = "Minimum multiple quantity (or lot) of financial instrument that may be exercised or tendered.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity22Choice.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity22Choice> getValue(CorporateActionQuantity6 obj) {
			return obj.getMinimumExercisableMultipleQuantity();
		}

		@Override
		public void setValue(CorporateActionQuantity6 obj, Optional<FinancialInstrumentQuantity22Choice> value) {
			obj.setMinimumExercisableMultipleQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "MaxQty")
	protected FinancialInstrumentQuantity21Choice maximumQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity21Choice
	 * FinancialInstrumentQuantity21Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmMaximumQuantity
	 * BiddingConditions.mmMaximumQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity6
	 * CorporateActionQuantity6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :36a::MQSO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The maximum number of securities the offeror/issuer is ready to purchase or redeem. This can be a number or the term \"any and all\"."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionQuantity6, Optional<FinancialInstrumentQuantity21Choice>> mmMaximumQuantity = new MMMessageAssociationEnd<CorporateActionQuantity6, Optional<FinancialInstrumentQuantity21Choice>>() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmMaximumQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionQuantity6.mmObject();
			isDerived = false;
			xmlTag = "MaxQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36a::MQSO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumQuantity";
			definition = "The maximum number of securities the offeror/issuer is ready to purchase or redeem. This can be a number or the term \"any and all\".";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity21Choice.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity21Choice> getValue(CorporateActionQuantity6 obj) {
			return obj.getMaximumQuantity();
		}

		@Override
		public void setValue(CorporateActionQuantity6 obj, Optional<FinancialInstrumentQuantity21Choice> value) {
			obj.setMaximumQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "MinQtySght")
	protected FinancialInstrumentQuantity21Choice minimumQuantitySought;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity21Choice
	 * FinancialInstrumentQuantity21Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmMinimumQuantitySought
	 * BiddingConditions.mmMinimumQuantitySought}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity6
	 * CorporateActionQuantity6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinQtySght"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :36a::QTSO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumQuantitySought"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum quantity of securities the offeror/issuer is ready to purchase or redeem under the terms of the event. This can be a number or the term \"any and all\"."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionQuantity6, Optional<FinancialInstrumentQuantity21Choice>> mmMinimumQuantitySought = new MMMessageAssociationEnd<CorporateActionQuantity6, Optional<FinancialInstrumentQuantity21Choice>>() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmMinimumQuantitySought;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionQuantity6.mmObject();
			isDerived = false;
			xmlTag = "MinQtySght";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36a::QTSO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumQuantitySought";
			definition = "Minimum quantity of securities the offeror/issuer is ready to purchase or redeem under the terms of the event. This can be a number or the term \"any and all\".";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity21Choice.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity21Choice> getValue(CorporateActionQuantity6 obj) {
			return obj.getMinimumQuantitySought();
		}

		@Override
		public void setValue(CorporateActionQuantity6 obj, Optional<FinancialInstrumentQuantity21Choice> value) {
			obj.setMinimumQuantitySought(value.orElse(null));
		}
	};
	@XmlElement(name = "NewBrdLotQty")
	protected FinancialInstrumentQuantity22Choice newBoardLotQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity22Choice
	 * FinancialInstrumentQuantity22Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmBoardLotSecuritiesQuantity
	 * SecuritiesProceedsDefinition.mmBoardLotSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity6
	 * CorporateActionQuantity6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewBrdLotQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :36B::NBLT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewBoardLotQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of equity that makes up the new board lot."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionQuantity6, Optional<FinancialInstrumentQuantity22Choice>> mmNewBoardLotQuantity = new MMMessageAssociationEnd<CorporateActionQuantity6, Optional<FinancialInstrumentQuantity22Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmBoardLotSecuritiesQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionQuantity6.mmObject();
			isDerived = false;
			xmlTag = "NewBrdLotQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::NBLT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewBoardLotQuantity";
			definition = "Quantity of equity that makes up the new board lot.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity22Choice.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity22Choice> getValue(CorporateActionQuantity6 obj) {
			return obj.getNewBoardLotQuantity();
		}

		@Override
		public void setValue(CorporateActionQuantity6 obj, Optional<FinancialInstrumentQuantity22Choice> value) {
			obj.setNewBoardLotQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "NewDnmtnQty")
	protected FinancialInstrumentQuantity22Choice newDenominationQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity22Choice
	 * FinancialInstrumentQuantity22Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmNewDenominationSecuritiesQuantity
	 * SecuritiesProceedsDefinition.mmNewDenominationSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity6
	 * CorporateActionQuantity6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewDnmtnQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :36B::NEWD</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewDenominationQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "New denomination of the equity following, for example, an increase or decrease in nominal value."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionQuantity6, Optional<FinancialInstrumentQuantity22Choice>> mmNewDenominationQuantity = new MMMessageAssociationEnd<CorporateActionQuantity6, Optional<FinancialInstrumentQuantity22Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmNewDenominationSecuritiesQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionQuantity6.mmObject();
			isDerived = false;
			xmlTag = "NewDnmtnQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::NEWD"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewDenominationQuantity";
			definition = "New denomination of the equity following, for example, an increase or decrease in nominal value.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity22Choice.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity22Choice> getValue(CorporateActionQuantity6 obj) {
			return obj.getNewDenominationQuantity();
		}

		@Override
		public void setValue(CorporateActionQuantity6 obj, Optional<FinancialInstrumentQuantity22Choice> value) {
			obj.setNewDenominationQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "BaseDnmtn")
	protected FinancialInstrumentQuantity22Choice baseDenomination;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity22Choice
	 * FinancialInstrumentQuantity22Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmBaseDenomination
	 * BiddingConditions.mmBaseDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity6
	 * CorporateActionQuantity6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BaseDnmtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :36B::BASE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BaseDenomination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum integral amount of securities that each account owner must have remaining after the called amounts are applied."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionQuantity6, Optional<FinancialInstrumentQuantity22Choice>> mmBaseDenomination = new MMMessageAssociationEnd<CorporateActionQuantity6, Optional<FinancialInstrumentQuantity22Choice>>() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmBaseDenomination;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionQuantity6.mmObject();
			isDerived = false;
			xmlTag = "BaseDnmtn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::BASE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BaseDenomination";
			definition = "Minimum integral amount of securities that each account owner must have remaining after the called amounts are applied.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity22Choice.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity22Choice> getValue(CorporateActionQuantity6 obj) {
			return obj.getBaseDenomination();
		}

		@Override
		public void setValue(CorporateActionQuantity6 obj, Optional<FinancialInstrumentQuantity22Choice> value) {
			obj.setBaseDenomination(value.orElse(null));
		}
	};
	@XmlElement(name = "IncrmtlDnmtn")
	protected FinancialInstrumentQuantity22Choice incrementalDenomination;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity22Choice
	 * FinancialInstrumentQuantity22Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Lottery#mmIncrementalDenomination
	 * Lottery.mmIncrementalDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity6
	 * CorporateActionQuantity6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IncrmtlDnmtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :36B::INCR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncrementalDenomination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount used when the called amount is not met by running the lottery with the base denomination."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionQuantity6, Optional<FinancialInstrumentQuantity22Choice>> mmIncrementalDenomination = new MMMessageAssociationEnd<CorporateActionQuantity6, Optional<FinancialInstrumentQuantity22Choice>>() {
		{
			businessElementTrace_lazy = () -> Lottery.mmIncrementalDenomination;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionQuantity6.mmObject();
			isDerived = false;
			xmlTag = "IncrmtlDnmtn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::INCR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncrementalDenomination";
			definition = "Amount used when the called amount is not met by running the lottery with the base denomination.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity22Choice.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity22Choice> getValue(CorporateActionQuantity6 obj) {
			return obj.getIncrementalDenomination();
		}

		@Override
		public void setValue(CorporateActionQuantity6 obj, Optional<FinancialInstrumentQuantity22Choice> value) {
			obj.setIncrementalDenomination(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionQuantity6.mmMinimumExercisableQuantity, com.tools20022.repository.msg.CorporateActionQuantity6.mmMinimumExercisableMultipleQuantity,
						com.tools20022.repository.msg.CorporateActionQuantity6.mmMaximumQuantity, com.tools20022.repository.msg.CorporateActionQuantity6.mmMinimumQuantitySought,
						com.tools20022.repository.msg.CorporateActionQuantity6.mmNewBoardLotQuantity, com.tools20022.repository.msg.CorporateActionQuantity6.mmNewDenominationQuantity,
						com.tools20022.repository.msg.CorporateActionQuantity6.mmBaseDenomination, com.tools20022.repository.msg.CorporateActionQuantity6.mmIncrementalDenomination);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forCorporateActionQuantity6,
						com.tools20022.repository.constraints.ConstraintMinimumExercisableQuantityRule.forCorporateActionQuantity6,
						com.tools20022.repository.constraints.ConstraintMaximumAndMinimumQuantitySoughtUsageRule.forCorporateActionQuantity6);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "CorporateActionQuantity6";
				definition = "Specifies corporate action quantities.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<FinancialInstrumentQuantity21Choice> getMinimumExercisableQuantity() {
		return minimumExercisableQuantity == null ? Optional.empty() : Optional.of(minimumExercisableQuantity);
	}

	public CorporateActionQuantity6 setMinimumExercisableQuantity(FinancialInstrumentQuantity21Choice minimumExercisableQuantity) {
		this.minimumExercisableQuantity = minimumExercisableQuantity;
		return this;
	}

	public Optional<FinancialInstrumentQuantity22Choice> getMinimumExercisableMultipleQuantity() {
		return minimumExercisableMultipleQuantity == null ? Optional.empty() : Optional.of(minimumExercisableMultipleQuantity);
	}

	public CorporateActionQuantity6 setMinimumExercisableMultipleQuantity(FinancialInstrumentQuantity22Choice minimumExercisableMultipleQuantity) {
		this.minimumExercisableMultipleQuantity = minimumExercisableMultipleQuantity;
		return this;
	}

	public Optional<FinancialInstrumentQuantity21Choice> getMaximumQuantity() {
		return maximumQuantity == null ? Optional.empty() : Optional.of(maximumQuantity);
	}

	public CorporateActionQuantity6 setMaximumQuantity(FinancialInstrumentQuantity21Choice maximumQuantity) {
		this.maximumQuantity = maximumQuantity;
		return this;
	}

	public Optional<FinancialInstrumentQuantity21Choice> getMinimumQuantitySought() {
		return minimumQuantitySought == null ? Optional.empty() : Optional.of(minimumQuantitySought);
	}

	public CorporateActionQuantity6 setMinimumQuantitySought(FinancialInstrumentQuantity21Choice minimumQuantitySought) {
		this.minimumQuantitySought = minimumQuantitySought;
		return this;
	}

	public Optional<FinancialInstrumentQuantity22Choice> getNewBoardLotQuantity() {
		return newBoardLotQuantity == null ? Optional.empty() : Optional.of(newBoardLotQuantity);
	}

	public CorporateActionQuantity6 setNewBoardLotQuantity(FinancialInstrumentQuantity22Choice newBoardLotQuantity) {
		this.newBoardLotQuantity = newBoardLotQuantity;
		return this;
	}

	public Optional<FinancialInstrumentQuantity22Choice> getNewDenominationQuantity() {
		return newDenominationQuantity == null ? Optional.empty() : Optional.of(newDenominationQuantity);
	}

	public CorporateActionQuantity6 setNewDenominationQuantity(FinancialInstrumentQuantity22Choice newDenominationQuantity) {
		this.newDenominationQuantity = newDenominationQuantity;
		return this;
	}

	public Optional<FinancialInstrumentQuantity22Choice> getBaseDenomination() {
		return baseDenomination == null ? Optional.empty() : Optional.of(baseDenomination);
	}

	public CorporateActionQuantity6 setBaseDenomination(FinancialInstrumentQuantity22Choice baseDenomination) {
		this.baseDenomination = baseDenomination;
		return this;
	}

	public Optional<FinancialInstrumentQuantity22Choice> getIncrementalDenomination() {
		return incrementalDenomination == null ? Optional.empty() : Optional.of(incrementalDenomination);
	}

	public CorporateActionQuantity6 setIncrementalDenomination(FinancialInstrumentQuantity22Choice incrementalDenomination) {
		this.incrementalDenomination = incrementalDenomination;
		return this;
	}
}