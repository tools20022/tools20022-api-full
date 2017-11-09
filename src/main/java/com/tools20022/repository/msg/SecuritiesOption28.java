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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.FinancialInstrumentQuantity21Choice;
import com.tools20022.repository.choice.FinancialInstrumentQuantity22Choice;
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
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption28#mmMaximumExercisableQuantity
 * SecuritiesOption28.mmMaximumExercisableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption28#mmMinimumExercisableQuantity
 * SecuritiesOption28.mmMinimumExercisableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption28#mmMinimumExercisableMultipleQuantity
 * SecuritiesOption28.mmMinimumExercisableMultipleQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption28#mmNewBoardLotQuantity
 * SecuritiesOption28.mmNewBoardLotQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption28#mmNewDenominationQuantity
 * SecuritiesOption28.mmNewDenominationQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption28#mmFrontEndOddLotQuantity
 * SecuritiesOption28.mmFrontEndOddLotQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption28#mmBackEndOddLotQuantity
 * SecuritiesOption28.mmBackEndOddLotQuantity}</li>
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
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesOption28"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the security option of a corporate event."</li>
 * </ul>
 */
public class SecuritiesOption28 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected FinancialInstrumentQuantity21Choice maximumExercisableQuantity;
	/**
	 * Maximum quantity (or lot) of financial instrument that may be exercised
	 * or tendered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity21Choice
	 * FinancialInstrumentQuantity21Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmMaximumExercisableQuantity
	 * SecuritiesConversion.mmMaximumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption28
	 * SecuritiesOption28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxExrcblQty"</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMaximumExercisableQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesConversion.mmMaximumExercisableQuantity;
			componentContext_lazy = () -> SecuritiesOption28.mmObject();
			isDerived = false;
			xmlTag = "MaxExrcblQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumExercisableQuantity";
			definition = "Maximum quantity (or lot) of financial instrument that may be exercised or tendered.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity21Choice.mmObject();
		}
	};
	protected FinancialInstrumentQuantity21Choice minimumExercisableQuantity;
	/**
	 * Minimum quantity (or lot) of financial instrument that may be exercised
	 * or tendered.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption28
	 * SecuritiesOption28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinExrcblQty"</li>
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
	public static final MMMessageAssociationEnd mmMinimumExercisableQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesConversion.mmMinimumExercisableQuantity;
			componentContext_lazy = () -> SecuritiesOption28.mmObject();
			isDerived = false;
			xmlTag = "MinExrcblQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumExercisableQuantity";
			definition = "Minimum quantity (or lot) of financial instrument that may be exercised or tendered.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity21Choice.mmObject();
		}
	};
	protected FinancialInstrumentQuantity22Choice minimumExercisableMultipleQuantity;
	/**
	 * Minimum multiple quantity (or lot) of financial instrument that may be
	 * exercised or tendered.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption28
	 * SecuritiesOption28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinExrcblMltplQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumExercisableMultipleQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum multiple quantity (or lot) of financial  instrument that may be exercised or tendered."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMinimumExercisableMultipleQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesConversion.mmMinimumExercisableMultipleQuantity;
			componentContext_lazy = () -> SecuritiesOption28.mmObject();
			isDerived = false;
			xmlTag = "MinExrcblMltplQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumExercisableMultipleQuantity";
			definition = "Minimum multiple quantity (or lot) of financial  instrument that may be exercised or tendered.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity22Choice.mmObject();
		}
	};
	protected FinancialInstrumentQuantity22Choice newBoardLotQuantity;
	/**
	 * Quantity of equity that makes up the new board lot.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption28
	 * SecuritiesOption28}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNewBoardLotQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmBoardLotSecuritiesQuantity;
			componentContext_lazy = () -> SecuritiesOption28.mmObject();
			isDerived = false;
			xmlTag = "NewBrdLotQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewBoardLotQuantity";
			definition = "Quantity of equity that makes up the new board lot.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity22Choice.mmObject();
		}
	};
	protected FinancialInstrumentQuantity22Choice newDenominationQuantity;
	/**
	 * New denomination of the equity following, for example, an increase or
	 * decrease in nominal value.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption28
	 * SecuritiesOption28}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNewDenominationQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmNewDenominationSecuritiesQuantity;
			componentContext_lazy = () -> SecuritiesOption28.mmObject();
			isDerived = false;
			xmlTag = "NewDnmtnQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewDenominationQuantity";
			definition = "New denomination of the equity following, for example, an increase or decrease in nominal value.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity22Choice.mmObject();
		}
	};
	protected FinancialInstrumentQuantity22Choice frontEndOddLotQuantity;
	/**
	 * Specifies that if an order is prorated holders of odd lots who tender
	 * their full position will not have tendered position prorated but rather
	 * accepted in full.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity22Choice
	 * FinancialInstrumentQuantity22Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmFrontEndOddLotQuantity
	 * BiddingConditions.mmFrontEndOddLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption28
	 * SecuritiesOption28}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFrontEndOddLotQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmFrontEndOddLotQuantity;
			componentContext_lazy = () -> SecuritiesOption28.mmObject();
			isDerived = false;
			xmlTag = "FrntEndOddLotQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrontEndOddLotQuantity";
			definition = "Specifies that if an order is prorated holders of odd lots who tender their full position will not have tendered position prorated but rather accepted in full.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity22Choice.mmObject();
		}
	};
	protected FinancialInstrumentQuantity22Choice backEndOddLotQuantity;
	/**
	 * Represents the presence of a back end odd lot provision and the quantity
	 * of equity required after proration to be eligible for this privilege.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity22Choice
	 * FinancialInstrumentQuantity22Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmBackEndOddLotQuantity
	 * BiddingConditions.mmBackEndOddLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption28
	 * SecuritiesOption28}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBackEndOddLotQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmBackEndOddLotQuantity;
			componentContext_lazy = () -> SecuritiesOption28.mmObject();
			isDerived = false;
			xmlTag = "BckEndOddLotQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BackEndOddLotQuantity";
			definition = "Represents the presence of a back end odd lot provision and the quantity of equity required after proration to be eligible for this privilege.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity22Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SecuritiesOption28.mmMaximumExercisableQuantity, SecuritiesOption28.mmMinimumExercisableQuantity, SecuritiesOption28.mmMinimumExercisableMultipleQuantity,
						SecuritiesOption28.mmNewBoardLotQuantity, SecuritiesOption28.mmNewDenominationQuantity, SecuritiesOption28.mmFrontEndOddLotQuantity, SecuritiesOption28.mmBackEndOddLotQuantity);
				trace_lazy = () -> CorporateActionOption.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "SecuritiesOption28";
				definition = "Specifies the security option of a corporate event.";
			}
		});
		return mmObject_lazy.get();
	}

	public FinancialInstrumentQuantity21Choice getMaximumExercisableQuantity() {
		return maximumExercisableQuantity;
	}

	public void setMaximumExercisableQuantity(FinancialInstrumentQuantity21Choice maximumExercisableQuantity) {
		this.maximumExercisableQuantity = maximumExercisableQuantity;
	}

	public FinancialInstrumentQuantity21Choice getMinimumExercisableQuantity() {
		return minimumExercisableQuantity;
	}

	public void setMinimumExercisableQuantity(FinancialInstrumentQuantity21Choice minimumExercisableQuantity) {
		this.minimumExercisableQuantity = minimumExercisableQuantity;
	}

	public FinancialInstrumentQuantity22Choice getMinimumExercisableMultipleQuantity() {
		return minimumExercisableMultipleQuantity;
	}

	public void setMinimumExercisableMultipleQuantity(FinancialInstrumentQuantity22Choice minimumExercisableMultipleQuantity) {
		this.minimumExercisableMultipleQuantity = minimumExercisableMultipleQuantity;
	}

	public FinancialInstrumentQuantity22Choice getNewBoardLotQuantity() {
		return newBoardLotQuantity;
	}

	public void setNewBoardLotQuantity(FinancialInstrumentQuantity22Choice newBoardLotQuantity) {
		this.newBoardLotQuantity = newBoardLotQuantity;
	}

	public FinancialInstrumentQuantity22Choice getNewDenominationQuantity() {
		return newDenominationQuantity;
	}

	public void setNewDenominationQuantity(FinancialInstrumentQuantity22Choice newDenominationQuantity) {
		this.newDenominationQuantity = newDenominationQuantity;
	}

	public FinancialInstrumentQuantity22Choice getFrontEndOddLotQuantity() {
		return frontEndOddLotQuantity;
	}

	public void setFrontEndOddLotQuantity(FinancialInstrumentQuantity22Choice frontEndOddLotQuantity) {
		this.frontEndOddLotQuantity = frontEndOddLotQuantity;
	}

	public FinancialInstrumentQuantity22Choice getBackEndOddLotQuantity() {
		return backEndOddLotQuantity;
	}

	public void setBackEndOddLotQuantity(FinancialInstrumentQuantity22Choice backEndOddLotQuantity) {
		this.backEndOddLotQuantity = backEndOddLotQuantity;
	}
}