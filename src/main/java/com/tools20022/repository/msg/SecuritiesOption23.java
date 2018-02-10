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
import com.tools20022.repository.choice.FinancialInstrumentQuantity19Choice;
import com.tools20022.repository.choice.FinancialInstrumentQuantity20Choice;
import com.tools20022.repository.entity.BiddingConditions;
import com.tools20022.repository.entity.CorporateActionOption;
import com.tools20022.repository.entity.SecuritiesConversion;
import com.tools20022.repository.entity.SecuritiesProceedsDefinition;
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
 * Specifies the security option of a corporate event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption23#mmMaximumExercisableQuantity
 * SecuritiesOption23.mmMaximumExercisableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption23#mmMinimumExercisableQuantity
 * SecuritiesOption23.mmMinimumExercisableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption23#mmMinimumExercisableMultipleQuantity
 * SecuritiesOption23.mmMinimumExercisableMultipleQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption23#mmNewBoardLotQuantity
 * SecuritiesOption23.mmNewBoardLotQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption23#mmNewDenominationQuantity
 * SecuritiesOption23.mmNewDenominationQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption23#mmFrontEndOddLotQuantity
 * SecuritiesOption23.mmFrontEndOddLotQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption23#mmBackEndOddLotQuantity
 * SecuritiesOption23.mmBackEndOddLotQuantity}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forSecuritiesOption23
 * ConstraintCoexistenceQuantityRule.forSecuritiesOption23}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesOption23"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the security option of a corporate event."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption51
 * SecuritiesOption51}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption15
 * SecuritiesOption15}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesOption23", propOrder = {"maximumExercisableQuantity", "minimumExercisableQuantity", "minimumExercisableMultipleQuantity", "newBoardLotQuantity", "newDenominationQuantity", "frontEndOddLotQuantity",
		"backEndOddLotQuantity"})
public class SecuritiesOption23 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MaxExrcblQty")
	protected FinancialInstrumentQuantity19Choice maximumExercisableQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity19Choice
	 * FinancialInstrumentQuantity19Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmMaximumExercisableQuantity
	 * SecuritiesConversion.mmMaximumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption23
	 * SecuritiesOption23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxExrcblQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :36B:MAEX</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumExercisableQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum quantity (or lot) of financial instrument that may be exercised or tendered."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption51#mmMaximumQuantityToInstruct
	 * SecuritiesOption51.mmMaximumQuantityToInstruct}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMaximumExercisableQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesConversion.mmMaximumExercisableQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOption23.mmObject();
			isDerived = false;
			xmlTag = "MaxExrcblQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B:MAEX"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumExercisableQuantity";
			definition = "Maximum quantity (or lot) of financial instrument that may be exercised or tendered.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesOption51.mmMaximumQuantityToInstruct);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity19Choice.mmObject();
		}
	};
	@XmlElement(name = "MinExrcblQty")
	protected FinancialInstrumentQuantity19Choice minimumExercisableQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity19Choice
	 * FinancialInstrumentQuantity19Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmMinimumExercisableQuantity
	 * SecuritiesConversion.mmMinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption23
	 * SecuritiesOption23}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption51#mmMinimumQuantityToInstruct
	 * SecuritiesOption51.mmMinimumQuantityToInstruct}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMinimumExercisableQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesConversion.mmMinimumExercisableQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOption23.mmObject();
			isDerived = false;
			xmlTag = "MinExrcblQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::MIEX"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumExercisableQuantity";
			definition = "Minimum quantity (or lot) of financial instrument that may be exercised or tendered.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesOption51.mmMinimumQuantityToInstruct);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity19Choice.mmObject();
		}
	};
	@XmlElement(name = "MinExrcblMltplQty")
	protected FinancialInstrumentQuantity20Choice minimumExercisableMultipleQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity20Choice
	 * FinancialInstrumentQuantity20Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmMinimumExercisableMultipleQuantity
	 * SecuritiesConversion.mmMinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption23
	 * SecuritiesOption23}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption51#mmMinimumMultipleQuantityToInstruct
	 * SecuritiesOption51.mmMinimumMultipleQuantityToInstruct}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMinimumExercisableMultipleQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesConversion.mmMinimumExercisableMultipleQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOption23.mmObject();
			isDerived = false;
			xmlTag = "MinExrcblMltplQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::MILT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumExercisableMultipleQuantity";
			definition = "Minimum multiple quantity (or lot) of financial instrument that may be exercised or tendered.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesOption51.mmMinimumMultipleQuantityToInstruct);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity20Choice.mmObject();
		}
	};
	@XmlElement(name = "NewBrdLotQty")
	protected FinancialInstrumentQuantity20Choice newBoardLotQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity20Choice
	 * FinancialInstrumentQuantity20Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmBoardLotSecuritiesQuantity
	 * SecuritiesProceedsDefinition.mmBoardLotSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption23
	 * SecuritiesOption23}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption51#mmNewBoardLotQuantity
	 * SecuritiesOption51.mmNewBoardLotQuantity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNewBoardLotQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmBoardLotSecuritiesQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOption23.mmObject();
			isDerived = false;
			xmlTag = "NewBrdLotQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::NBLT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewBoardLotQuantity";
			definition = "Quantity of equity that makes up the new board lot.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesOption51.mmNewBoardLotQuantity);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity20Choice.mmObject();
		}
	};
	@XmlElement(name = "NewDnmtnQty")
	protected FinancialInstrumentQuantity20Choice newDenominationQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity20Choice
	 * FinancialInstrumentQuantity20Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmNewDenominationSecuritiesQuantity
	 * SecuritiesProceedsDefinition.mmNewDenominationSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption23
	 * SecuritiesOption23}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption51#mmNewDenominationQuantity
	 * SecuritiesOption51.mmNewDenominationQuantity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNewDenominationQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmNewDenominationSecuritiesQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOption23.mmObject();
			isDerived = false;
			xmlTag = "NewDnmtnQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::NEWD"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewDenominationQuantity";
			definition = "New denomination of the equity following, for example, an increase or decrease in nominal value.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesOption51.mmNewDenominationQuantity);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity20Choice.mmObject();
		}
	};
	@XmlElement(name = "FrntEndOddLotQty")
	protected FinancialInstrumentQuantity20Choice frontEndOddLotQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity20Choice
	 * FinancialInstrumentQuantity20Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmFrontEndOddLotQuantity
	 * BiddingConditions.mmFrontEndOddLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption23
	 * SecuritiesOption23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrntEndOddLotQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :36B::FOLQ</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrontEndOddLotQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that if an order is prorated holders of odd lots who tender their full position will not have tendered position prorated but rather accepted in full."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption51#mmFrontEndOddLotQuantity
	 * SecuritiesOption51.mmFrontEndOddLotQuantity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFrontEndOddLotQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmFrontEndOddLotQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOption23.mmObject();
			isDerived = false;
			xmlTag = "FrntEndOddLotQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::FOLQ"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrontEndOddLotQuantity";
			definition = "Specifies that if an order is prorated holders of odd lots who tender their full position will not have tendered position prorated but rather accepted in full.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesOption51.mmFrontEndOddLotQuantity);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity20Choice.mmObject();
		}
	};
	@XmlElement(name = "BckEndOddLotQty")
	protected FinancialInstrumentQuantity20Choice backEndOddLotQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity20Choice
	 * FinancialInstrumentQuantity20Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmBackEndOddLotQuantity
	 * BiddingConditions.mmBackEndOddLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption23
	 * SecuritiesOption23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BckEndOddLotQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :36B::BOLQ</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BackEndOddLotQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Represents the presence of a back end odd lot provision and the quantity of equity required after proration to be eligible for this privilege."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption51#mmBackEndOddLotQuantity
	 * SecuritiesOption51.mmBackEndOddLotQuantity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBackEndOddLotQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmBackEndOddLotQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOption23.mmObject();
			isDerived = false;
			xmlTag = "BckEndOddLotQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::BOLQ"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BackEndOddLotQuantity";
			definition = "Represents the presence of a back end odd lot provision and the quantity of equity required after proration to be eligible for this privilege.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesOption51.mmBackEndOddLotQuantity);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity20Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesOption23.mmMaximumExercisableQuantity, com.tools20022.repository.msg.SecuritiesOption23.mmMinimumExercisableQuantity,
						com.tools20022.repository.msg.SecuritiesOption23.mmMinimumExercisableMultipleQuantity, com.tools20022.repository.msg.SecuritiesOption23.mmNewBoardLotQuantity,
						com.tools20022.repository.msg.SecuritiesOption23.mmNewDenominationQuantity, com.tools20022.repository.msg.SecuritiesOption23.mmFrontEndOddLotQuantity,
						com.tools20022.repository.msg.SecuritiesOption23.mmBackEndOddLotQuantity);
				trace_lazy = () -> CorporateActionOption.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forSecuritiesOption23);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "SecuritiesOption23";
				definition = "Specifies the security option of a corporate event.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesOption51.mmObject());
				previousVersion_lazy = () -> SecuritiesOption15.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<FinancialInstrumentQuantity19Choice> getMaximumExercisableQuantity() {
		return maximumExercisableQuantity == null ? Optional.empty() : Optional.of(maximumExercisableQuantity);
	}

	public SecuritiesOption23 setMaximumExercisableQuantity(FinancialInstrumentQuantity19Choice maximumExercisableQuantity) {
		this.maximumExercisableQuantity = maximumExercisableQuantity;
		return this;
	}

	public Optional<FinancialInstrumentQuantity19Choice> getMinimumExercisableQuantity() {
		return minimumExercisableQuantity == null ? Optional.empty() : Optional.of(minimumExercisableQuantity);
	}

	public SecuritiesOption23 setMinimumExercisableQuantity(FinancialInstrumentQuantity19Choice minimumExercisableQuantity) {
		this.minimumExercisableQuantity = minimumExercisableQuantity;
		return this;
	}

	public Optional<FinancialInstrumentQuantity20Choice> getMinimumExercisableMultipleQuantity() {
		return minimumExercisableMultipleQuantity == null ? Optional.empty() : Optional.of(minimumExercisableMultipleQuantity);
	}

	public SecuritiesOption23 setMinimumExercisableMultipleQuantity(FinancialInstrumentQuantity20Choice minimumExercisableMultipleQuantity) {
		this.minimumExercisableMultipleQuantity = minimumExercisableMultipleQuantity;
		return this;
	}

	public Optional<FinancialInstrumentQuantity20Choice> getNewBoardLotQuantity() {
		return newBoardLotQuantity == null ? Optional.empty() : Optional.of(newBoardLotQuantity);
	}

	public SecuritiesOption23 setNewBoardLotQuantity(FinancialInstrumentQuantity20Choice newBoardLotQuantity) {
		this.newBoardLotQuantity = newBoardLotQuantity;
		return this;
	}

	public Optional<FinancialInstrumentQuantity20Choice> getNewDenominationQuantity() {
		return newDenominationQuantity == null ? Optional.empty() : Optional.of(newDenominationQuantity);
	}

	public SecuritiesOption23 setNewDenominationQuantity(FinancialInstrumentQuantity20Choice newDenominationQuantity) {
		this.newDenominationQuantity = newDenominationQuantity;
		return this;
	}

	public Optional<FinancialInstrumentQuantity20Choice> getFrontEndOddLotQuantity() {
		return frontEndOddLotQuantity == null ? Optional.empty() : Optional.of(frontEndOddLotQuantity);
	}

	public SecuritiesOption23 setFrontEndOddLotQuantity(FinancialInstrumentQuantity20Choice frontEndOddLotQuantity) {
		this.frontEndOddLotQuantity = frontEndOddLotQuantity;
		return this;
	}

	public Optional<FinancialInstrumentQuantity20Choice> getBackEndOddLotQuantity() {
		return backEndOddLotQuantity == null ? Optional.empty() : Optional.of(backEndOddLotQuantity);
	}

	public SecuritiesOption23 setBackEndOddLotQuantity(FinancialInstrumentQuantity20Choice backEndOddLotQuantity) {
		this.backEndOddLotQuantity = backEndOddLotQuantity;
		return this;
	}
}