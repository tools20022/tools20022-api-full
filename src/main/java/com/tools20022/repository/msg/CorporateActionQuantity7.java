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
import com.tools20022.repository.entity.CorporateActionEvent;
import com.tools20022.repository.entity.Lottery;
import com.tools20022.repository.entity.SecuritiesProceedsDefinition;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity7#mmMaximumQuantity
 * CorporateActionQuantity7.mmMaximumQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity7#mmMinimumQuantitySought
 * CorporateActionQuantity7.mmMinimumQuantitySought}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity7#mmNewBoardLotQuantity
 * CorporateActionQuantity7.mmNewBoardLotQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity7#mmNewDenominationQuantity
 * CorporateActionQuantity7.mmNewDenominationQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity7#mmBaseDenomination
 * CorporateActionQuantity7.mmBaseDenomination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity7#mmIncrementalDenomination
 * CorporateActionQuantity7.mmIncrementalDenomination}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintMaximumAndMinimumQuantitySoughtUsageRule#forCorporateActionQuantity7
 * ConstraintMaximumAndMinimumQuantitySoughtUsageRule.
 * forCorporateActionQuantity7}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionQuantity7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies corporate action quantities."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity5
 * CorporateActionQuantity5}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionQuantity7", propOrder = {"maximumQuantity", "minimumQuantitySought", "newBoardLotQuantity", "newDenominationQuantity", "baseDenomination", "incrementalDenomination"})
public class CorporateActionQuantity7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MaxQty")
	protected FinancialInstrumentQuantity19Choice maximumQuantity;
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
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmMaximumQuantity
	 * BiddingConditions.mmMaximumQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity7
	 * CorporateActionQuantity7}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity5#mmMaximumQuantity
	 * CorporateActionQuantity5.mmMaximumQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMaximumQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmMaximumQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionQuantity7.mmObject();
			isDerived = false;
			xmlTag = "MaxQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36a::MQSO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumQuantity";
			definition = "The maximum number of securities the offeror/issuer is ready to purchase or redeem. This can be a number or the term \"any and all\".";
			previousVersion_lazy = () -> CorporateActionQuantity5.mmMaximumQuantity;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity19Choice.mmObject();
		}
	};
	@XmlElement(name = "MinQtySght")
	protected FinancialInstrumentQuantity19Choice minimumQuantitySought;
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
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmMinimumQuantitySought
	 * BiddingConditions.mmMinimumQuantitySought}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity7
	 * CorporateActionQuantity7}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity5#mmMinimumQuantitySought
	 * CorporateActionQuantity5.mmMinimumQuantitySought}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMinimumQuantitySought = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmMinimumQuantitySought;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionQuantity7.mmObject();
			isDerived = false;
			xmlTag = "MinQtySght";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36a::QTSO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumQuantitySought";
			definition = "Minimum quantity of securities the offeror/issuer is ready to purchase or redeem under the terms of the event. This can be a number or the term \"any and all\".";
			previousVersion_lazy = () -> CorporateActionQuantity5.mmMinimumQuantitySought;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity19Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity7
	 * CorporateActionQuantity7}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity5#mmNewBoardLotQuantity
	 * CorporateActionQuantity5.mmNewBoardLotQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNewBoardLotQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmBoardLotSecuritiesQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionQuantity7.mmObject();
			isDerived = false;
			xmlTag = "NewBrdLotQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::NBLT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewBoardLotQuantity";
			definition = "Quantity of equity that makes up the new board lot.";
			previousVersion_lazy = () -> CorporateActionQuantity5.mmNewBoardLotQuantity;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity7
	 * CorporateActionQuantity7}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity5#mmNewDenominationQuantity
	 * CorporateActionQuantity5.mmNewDenominationQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNewDenominationQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmNewDenominationSecuritiesQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionQuantity7.mmObject();
			isDerived = false;
			xmlTag = "NewDnmtnQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::NEWD"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewDenominationQuantity";
			definition = "New denomination of the equity following, for example, an increase or decrease in nominal value.";
			previousVersion_lazy = () -> CorporateActionQuantity5.mmNewDenominationQuantity;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity20Choice.mmObject();
		}
	};
	@XmlElement(name = "BaseDnmtn")
	protected FinancialInstrumentQuantity20Choice baseDenomination;
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
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmBaseDenomination
	 * BiddingConditions.mmBaseDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity7
	 * CorporateActionQuantity7}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity5#mmBaseDenomination
	 * CorporateActionQuantity5.mmBaseDenomination}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBaseDenomination = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmBaseDenomination;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionQuantity7.mmObject();
			isDerived = false;
			xmlTag = "BaseDnmtn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::BASE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BaseDenomination";
			definition = "Minimum integral amount of securities that each account owner must have remaining after the called amounts are applied.";
			previousVersion_lazy = () -> CorporateActionQuantity5.mmBaseDenomination;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity20Choice.mmObject();
		}
	};
	@XmlElement(name = "IncrmtlDnmtn")
	protected FinancialInstrumentQuantity20Choice incrementalDenomination;
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
	 * {@linkplain com.tools20022.repository.entity.Lottery#mmIncrementalDenomination
	 * Lottery.mmIncrementalDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity7
	 * CorporateActionQuantity7}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity5#mmIncrementalDenomination
	 * CorporateActionQuantity5.mmIncrementalDenomination}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIncrementalDenomination = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Lottery.mmIncrementalDenomination;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionQuantity7.mmObject();
			isDerived = false;
			xmlTag = "IncrmtlDnmtn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::INCR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncrementalDenomination";
			definition = "Amount used when the called amount is not met by running the lottery with the base denomination.";
			previousVersion_lazy = () -> CorporateActionQuantity5.mmIncrementalDenomination;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity20Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionQuantity7.mmMaximumQuantity, com.tools20022.repository.msg.CorporateActionQuantity7.mmMinimumQuantitySought,
						com.tools20022.repository.msg.CorporateActionQuantity7.mmNewBoardLotQuantity, com.tools20022.repository.msg.CorporateActionQuantity7.mmNewDenominationQuantity,
						com.tools20022.repository.msg.CorporateActionQuantity7.mmBaseDenomination, com.tools20022.repository.msg.CorporateActionQuantity7.mmIncrementalDenomination);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintMaximumAndMinimumQuantitySoughtUsageRule.forCorporateActionQuantity7);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionQuantity7";
				definition = "Specifies corporate action quantities.";
				previousVersion_lazy = () -> CorporateActionQuantity5.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<FinancialInstrumentQuantity19Choice> getMaximumQuantity() {
		return maximumQuantity == null ? Optional.empty() : Optional.of(maximumQuantity);
	}

	public CorporateActionQuantity7 setMaximumQuantity(FinancialInstrumentQuantity19Choice maximumQuantity) {
		this.maximumQuantity = maximumQuantity;
		return this;
	}

	public Optional<FinancialInstrumentQuantity19Choice> getMinimumQuantitySought() {
		return minimumQuantitySought == null ? Optional.empty() : Optional.of(minimumQuantitySought);
	}

	public CorporateActionQuantity7 setMinimumQuantitySought(FinancialInstrumentQuantity19Choice minimumQuantitySought) {
		this.minimumQuantitySought = minimumQuantitySought;
		return this;
	}

	public Optional<FinancialInstrumentQuantity20Choice> getNewBoardLotQuantity() {
		return newBoardLotQuantity == null ? Optional.empty() : Optional.of(newBoardLotQuantity);
	}

	public CorporateActionQuantity7 setNewBoardLotQuantity(FinancialInstrumentQuantity20Choice newBoardLotQuantity) {
		this.newBoardLotQuantity = newBoardLotQuantity;
		return this;
	}

	public Optional<FinancialInstrumentQuantity20Choice> getNewDenominationQuantity() {
		return newDenominationQuantity == null ? Optional.empty() : Optional.of(newDenominationQuantity);
	}

	public CorporateActionQuantity7 setNewDenominationQuantity(FinancialInstrumentQuantity20Choice newDenominationQuantity) {
		this.newDenominationQuantity = newDenominationQuantity;
		return this;
	}

	public Optional<FinancialInstrumentQuantity20Choice> getBaseDenomination() {
		return baseDenomination == null ? Optional.empty() : Optional.of(baseDenomination);
	}

	public CorporateActionQuantity7 setBaseDenomination(FinancialInstrumentQuantity20Choice baseDenomination) {
		this.baseDenomination = baseDenomination;
		return this;
	}

	public Optional<FinancialInstrumentQuantity20Choice> getIncrementalDenomination() {
		return incrementalDenomination == null ? Optional.empty() : Optional.of(incrementalDenomination);
	}

	public CorporateActionQuantity7 setIncrementalDenomination(FinancialInstrumentQuantity20Choice incrementalDenomination) {
		this.incrementalDenomination = incrementalDenomination;
		return this;
	}
}