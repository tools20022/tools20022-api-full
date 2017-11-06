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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.choice.FinancialInstrumentQuantity19Choice;
import com.tools20022.repository.choice.FinancialInstrumentQuantity20Choice;
import com.tools20022.repository.entity.CorporateActionOption;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption51#mmMaximumQuantityToInstruct
 * SecuritiesOption51.mmMaximumQuantityToInstruct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption51#mmMinimumQuantityToInstruct
 * SecuritiesOption51.mmMinimumQuantityToInstruct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption51#mmMinimumMultipleQuantityToInstruct
 * SecuritiesOption51.mmMinimumMultipleQuantityToInstruct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption51#mmNewBoardLotQuantity
 * SecuritiesOption51.mmNewBoardLotQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption51#mmNewDenominationQuantity
 * SecuritiesOption51.mmNewDenominationQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption51#mmFrontEndOddLotQuantity
 * SecuritiesOption51.mmFrontEndOddLotQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption51#mmBackEndOddLotQuantity
 * SecuritiesOption51.mmBackEndOddLotQuantity}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionOption
 * CorporateActionOption}</li>
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
 * "SecuritiesOption51"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the security option of a corporate event."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption23
 * SecuritiesOption23}</li>
 * </ul>
 */
public class SecuritiesOption51 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected FinancialInstrumentQuantity19Choice maximumQuantityToInstruct;
	/**
	 * Maximum quantity of financial instrument that may be instructed.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption51
	 * SecuritiesOption51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxQtyToInst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumQuantityToInstruct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum quantity of financial instrument that may be instructed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption23#mmMaximumExercisableQuantity
	 * SecuritiesOption23.mmMaximumExercisableQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMaximumQuantityToInstruct = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmMaximumExercisableQuantity;
			componentContext_lazy = () -> SecuritiesOption51.mmObject();
			isDerived = false;
			xmlTag = "MaxQtyToInst";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumQuantityToInstruct";
			definition = "Maximum quantity of financial instrument that may be instructed.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.SecuritiesOption23.mmMaximumExercisableQuantity;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity19Choice.mmObject();
		}
	};
	protected FinancialInstrumentQuantity19Choice minimumQuantityToInstruct;
	/**
	 * Minimum quantity of financial instrument that may be instructed.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption51
	 * SecuritiesOption51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinQtyToInst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumQuantityToInstruct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum quantity of financial instrument that may be instructed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption23#mmMinimumExercisableQuantity
	 * SecuritiesOption23.mmMinimumExercisableQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMinimumQuantityToInstruct = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmMinimumExercisableQuantity;
			componentContext_lazy = () -> SecuritiesOption51.mmObject();
			isDerived = false;
			xmlTag = "MinQtyToInst";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumQuantityToInstruct";
			definition = "Minimum quantity of financial instrument that may be instructed.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.SecuritiesOption23.mmMinimumExercisableQuantity;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity19Choice.mmObject();
		}
	};
	protected FinancialInstrumentQuantity20Choice minimumMultipleQuantityToInstruct;
	/**
	 * Minimum multiple quantity of financial instrument that may be instructed.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption51
	 * SecuritiesOption51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinMltplQtyToInst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumMultipleQuantityToInstruct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum multiple quantity of financial  instrument that may be instructed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption23#mmMinimumExercisableMultipleQuantity
	 * SecuritiesOption23.mmMinimumExercisableMultipleQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMinimumMultipleQuantityToInstruct = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmMinimumExercisableMultipleQuantity;
			componentContext_lazy = () -> SecuritiesOption51.mmObject();
			isDerived = false;
			xmlTag = "MinMltplQtyToInst";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumMultipleQuantityToInstruct";
			definition = "Minimum multiple quantity of financial  instrument that may be instructed.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.SecuritiesOption23.mmMinimumExercisableMultipleQuantity;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity20Choice.mmObject();
		}
	};
	protected FinancialInstrumentQuantity20Choice newBoardLotQuantity;
	/**
	 * Quantity of equity that makes up the new board lot.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption51
	 * SecuritiesOption51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewBrdLotQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewBoardLotQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of equity that makes up the new board lot."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption23#mmNewBoardLotQuantity
	 * SecuritiesOption23.mmNewBoardLotQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNewBoardLotQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmBoardLotSecuritiesQuantity;
			componentContext_lazy = () -> SecuritiesOption51.mmObject();
			isDerived = false;
			xmlTag = "NewBrdLotQty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewBoardLotQuantity";
			definition = "Quantity of equity that makes up the new board lot.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.SecuritiesOption23.mmNewBoardLotQuantity;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity20Choice.mmObject();
		}
	};
	protected FinancialInstrumentQuantity20Choice newDenominationQuantity;
	/**
	 * New denomination of the equity following, for example, an increase or
	 * decrease in nominal value.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption51
	 * SecuritiesOption51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewDnmtnQty"</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption23#mmNewDenominationQuantity
	 * SecuritiesOption23.mmNewDenominationQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNewDenominationQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmNewDenominationSecuritiesQuantity;
			componentContext_lazy = () -> SecuritiesOption51.mmObject();
			isDerived = false;
			xmlTag = "NewDnmtnQty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewDenominationQuantity";
			definition = "New denomination of the equity following, for example, an increase or decrease in nominal value.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.SecuritiesOption23.mmNewDenominationQuantity;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity20Choice.mmObject();
		}
	};
	protected FinancialInstrumentQuantity20Choice frontEndOddLotQuantity;
	/**
	 * Specifies that if an order is prorated holders of odd lots who tender
	 * their full position will not have tendered position prorated but rather
	 * accepted in full.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption51
	 * SecuritiesOption51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrntEndOddLotQty"</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption23#mmFrontEndOddLotQuantity
	 * SecuritiesOption23.mmFrontEndOddLotQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFrontEndOddLotQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmFrontEndOddLotQuantity;
			componentContext_lazy = () -> SecuritiesOption51.mmObject();
			isDerived = false;
			xmlTag = "FrntEndOddLotQty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrontEndOddLotQuantity";
			definition = "Specifies that if an order is prorated holders of odd lots who tender their full position will not have tendered position prorated but rather accepted in full.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.SecuritiesOption23.mmFrontEndOddLotQuantity;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity20Choice.mmObject();
		}
	};
	protected FinancialInstrumentQuantity20Choice backEndOddLotQuantity;
	/**
	 * Represents the presence of a back end odd lot provision and the quantity
	 * of equity required after proration to be eligible for this privilege.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption51
	 * SecuritiesOption51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BckEndOddLotQty"</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption23#mmBackEndOddLotQuantity
	 * SecuritiesOption23.mmBackEndOddLotQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBackEndOddLotQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmBackEndOddLotQuantity;
			componentContext_lazy = () -> SecuritiesOption51.mmObject();
			isDerived = false;
			xmlTag = "BckEndOddLotQty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BackEndOddLotQuantity";
			definition = "Represents the presence of a back end odd lot provision and the quantity of equity required after proration to be eligible for this privilege.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.SecuritiesOption23.mmBackEndOddLotQuantity;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity20Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesOption51.mmMaximumQuantityToInstruct, com.tools20022.repository.msg.SecuritiesOption51.mmMinimumQuantityToInstruct,
						com.tools20022.repository.msg.SecuritiesOption51.mmMinimumMultipleQuantityToInstruct, com.tools20022.repository.msg.SecuritiesOption51.mmNewBoardLotQuantity,
						com.tools20022.repository.msg.SecuritiesOption51.mmNewDenominationQuantity, com.tools20022.repository.msg.SecuritiesOption51.mmFrontEndOddLotQuantity,
						com.tools20022.repository.msg.SecuritiesOption51.mmBackEndOddLotQuantity);
				trace_lazy = () -> CorporateActionOption.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesOption51";
				definition = "Specifies the security option of a corporate event.";
				previousVersion_lazy = () -> SecuritiesOption23.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public FinancialInstrumentQuantity19Choice getMaximumQuantityToInstruct() {
		return maximumQuantityToInstruct;
	}

	public void setMaximumQuantityToInstruct(FinancialInstrumentQuantity19Choice maximumQuantityToInstruct) {
		this.maximumQuantityToInstruct = maximumQuantityToInstruct;
	}

	public FinancialInstrumentQuantity19Choice getMinimumQuantityToInstruct() {
		return minimumQuantityToInstruct;
	}

	public void setMinimumQuantityToInstruct(FinancialInstrumentQuantity19Choice minimumQuantityToInstruct) {
		this.minimumQuantityToInstruct = minimumQuantityToInstruct;
	}

	public FinancialInstrumentQuantity20Choice getMinimumMultipleQuantityToInstruct() {
		return minimumMultipleQuantityToInstruct;
	}

	public void setMinimumMultipleQuantityToInstruct(FinancialInstrumentQuantity20Choice minimumMultipleQuantityToInstruct) {
		this.minimumMultipleQuantityToInstruct = minimumMultipleQuantityToInstruct;
	}

	public FinancialInstrumentQuantity20Choice getNewBoardLotQuantity() {
		return newBoardLotQuantity;
	}

	public void setNewBoardLotQuantity(FinancialInstrumentQuantity20Choice newBoardLotQuantity) {
		this.newBoardLotQuantity = newBoardLotQuantity;
	}

	public FinancialInstrumentQuantity20Choice getNewDenominationQuantity() {
		return newDenominationQuantity;
	}

	public void setNewDenominationQuantity(FinancialInstrumentQuantity20Choice newDenominationQuantity) {
		this.newDenominationQuantity = newDenominationQuantity;
	}

	public FinancialInstrumentQuantity20Choice getFrontEndOddLotQuantity() {
		return frontEndOddLotQuantity;
	}

	public void setFrontEndOddLotQuantity(FinancialInstrumentQuantity20Choice frontEndOddLotQuantity) {
		this.frontEndOddLotQuantity = frontEndOddLotQuantity;
	}

	public FinancialInstrumentQuantity20Choice getBackEndOddLotQuantity() {
		return backEndOddLotQuantity;
	}

	public void setBackEndOddLotQuantity(FinancialInstrumentQuantity20Choice backEndOddLotQuantity) {
		this.backEndOddLotQuantity = backEndOddLotQuantity;
	}
}