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
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
public class CorporateActionQuantity6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity6
	 * CorporateActionQuantity6}</li>
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
			componentContext_lazy = () -> CorporateActionQuantity6.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity6
	 * CorporateActionQuantity6}</li>
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
	 * "Minimum multiple quantity (or lot) of financial instrument that  may be exercised or tendered."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMinimumExercisableMultipleQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesConversion.mmMinimumExercisableMultipleQuantity;
			componentContext_lazy = () -> CorporateActionQuantity6.mmObject();
			isDerived = false;
			xmlTag = "MinExrcblMltplQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumExercisableMultipleQuantity";
			definition = "Minimum multiple quantity (or lot) of financial instrument that  may be exercised or tendered.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity22Choice.mmObject();
		}
	};
	protected FinancialInstrumentQuantity21Choice maximumQuantity;
	/**
	 * The maximum number of securities the offeror/issuer is ready to purchase
	 * or redeem. This can be a number or the term "any and all".
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
	public static final MMMessageAssociationEnd mmMaximumQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmMaximumQuantity;
			componentContext_lazy = () -> CorporateActionQuantity6.mmObject();
			isDerived = false;
			xmlTag = "MaxQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumQuantity";
			definition = "The maximum number of securities the offeror/issuer is ready to purchase or redeem. This can be a number or the term \"any and all\".";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity21Choice.mmObject();
		}
	};
	protected FinancialInstrumentQuantity21Choice minimumQuantitySought;
	/**
	 * Minimum quantity of securities the offeror/issuer is ready to purchase or
	 * redeem under the terms of the event. This can be a number or the term
	 * "any and all".
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
	public static final MMMessageAssociationEnd mmMinimumQuantitySought = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmMinimumQuantitySought;
			componentContext_lazy = () -> CorporateActionQuantity6.mmObject();
			isDerived = false;
			xmlTag = "MinQtySght";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumQuantitySought";
			definition = "Minimum quantity of securities the offeror/issuer is ready to purchase or redeem under the terms of the event. This can be a number or the term \"any and all\".";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity21Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity6
	 * CorporateActionQuantity6}</li>
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
			componentContext_lazy = () -> CorporateActionQuantity6.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity6
	 * CorporateActionQuantity6}</li>
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
			componentContext_lazy = () -> CorporateActionQuantity6.mmObject();
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
	protected FinancialInstrumentQuantity22Choice baseDenomination;
	/**
	 * Minimum integral amount of securities that each account owner must have
	 * remaining after the called amounts are applied.
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
	public static final MMMessageAssociationEnd mmBaseDenomination = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmBaseDenomination;
			componentContext_lazy = () -> CorporateActionQuantity6.mmObject();
			isDerived = false;
			xmlTag = "BaseDnmtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BaseDenomination";
			definition = "Minimum integral amount of securities that each account owner must have remaining after the called amounts are applied.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity22Choice.mmObject();
		}
	};
	protected FinancialInstrumentQuantity22Choice incrementalDenomination;
	/**
	 * Amount used when the called amount is not met by running the lottery with
	 * the base denomination.
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
	public static final MMMessageAssociationEnd mmIncrementalDenomination = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Lottery.mmIncrementalDenomination;
			componentContext_lazy = () -> CorporateActionQuantity6.mmObject();
			isDerived = false;
			xmlTag = "IncrmtlDnmtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncrementalDenomination";
			definition = "Amount used when the called amount is not met by running the lottery with the base denomination.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity22Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionQuantity6.mmMinimumExercisableQuantity, CorporateActionQuantity6.mmMinimumExercisableMultipleQuantity, CorporateActionQuantity6.mmMaximumQuantity,
						CorporateActionQuantity6.mmMinimumQuantitySought, CorporateActionQuantity6.mmNewBoardLotQuantity, CorporateActionQuantity6.mmNewDenominationQuantity, CorporateActionQuantity6.mmBaseDenomination,
						CorporateActionQuantity6.mmIncrementalDenomination);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
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

	public FinancialInstrumentQuantity21Choice getMaximumQuantity() {
		return maximumQuantity;
	}

	public void setMaximumQuantity(FinancialInstrumentQuantity21Choice maximumQuantity) {
		this.maximumQuantity = maximumQuantity;
	}

	public FinancialInstrumentQuantity21Choice getMinimumQuantitySought() {
		return minimumQuantitySought;
	}

	public void setMinimumQuantitySought(FinancialInstrumentQuantity21Choice minimumQuantitySought) {
		this.minimumQuantitySought = minimumQuantitySought;
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

	public FinancialInstrumentQuantity22Choice getBaseDenomination() {
		return baseDenomination;
	}

	public void setBaseDenomination(FinancialInstrumentQuantity22Choice baseDenomination) {
		this.baseDenomination = baseDenomination;
	}

	public FinancialInstrumentQuantity22Choice getIncrementalDenomination() {
		return incrementalDenomination;
	}

	public void setIncrementalDenomination(FinancialInstrumentQuantity22Choice incrementalDenomination) {
		this.incrementalDenomination = incrementalDenomination;
	}
}