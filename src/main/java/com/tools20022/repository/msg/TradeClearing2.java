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
import com.tools20022.repository.choice.Cleared3Choice;
import com.tools20022.repository.codeset.ClearingObligationType1Code;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.Obligation;
import com.tools20022.repository.entity.SecuritiesClearing;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related to the clearing of the contract.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeClearing2#mmClearingObligation
 * TradeClearing2.mmClearingObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeClearing2#mmClearingStatus
 * TradeClearing2.mmClearingStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeClearing2#mmIntraGroup
 * TradeClearing2.mmIntraGroup}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesClearing
 * SecuritiesClearing}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOneElementPresentRule#forTradeClearing2
 * ConstraintOneElementPresentRule.forTradeClearing2}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeClearing2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information related to the clearing of the contract."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TradeClearing2", propOrder = {"clearingObligation", "clearingStatus", "intraGroup"})
public class TradeClearing2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ClrOblgtn")
	protected ClearingObligationType1Code clearingObligation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingObligationType1Code
	 * ClearingObligationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Obligation Obligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeClearing2 TradeClearing2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrOblgtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates, whether the reported contract belongs to a class of OTC derivatives that has been declared subject to the clearing obligation and both counterparties to the contract are subject to the clearing obligation, as of the time of execution of the contract."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeClearing2, Optional<ClearingObligationType1Code>> mmClearingObligation = new MMMessageAttribute<TradeClearing2, Optional<ClearingObligationType1Code>>() {
		{
			businessComponentTrace_lazy = () -> Obligation.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeClearing2.mmObject();
			isDerived = false;
			xmlTag = "ClrOblgtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingObligation";
			definition = "Indicates, whether the reported contract belongs to a class of OTC derivatives that has been declared subject to the clearing obligation and both counterparties to the contract are subject to the clearing obligation, as of the time of execution of the contract.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ClearingObligationType1Code.mmObject();
		}

		@Override
		public Optional<ClearingObligationType1Code> getValue(TradeClearing2 obj) {
			return obj.getClearingObligation();
		}

		@Override
		public void setValue(TradeClearing2 obj, Optional<ClearingObligationType1Code> value) {
			obj.setClearingObligation(value.orElse(null));
		}
	};
	@XmlElement(name = "ClrSts")
	protected Cleared3Choice clearingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Cleared3Choice
	 * Cleared3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeClearing2 TradeClearing2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether clearing of contract has taken place."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeClearing2, Optional<Cleared3Choice>> mmClearingStatus = new MMMessageAssociationEnd<TradeClearing2, Optional<Cleared3Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeClearing2.mmObject();
			isDerived = false;
			xmlTag = "ClrSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingStatus";
			definition = "Indicates whether clearing of contract has taken place.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Cleared3Choice.mmObject();
		}

		@Override
		public Optional<Cleared3Choice> getValue(TradeClearing2 obj) {
			return obj.getClearingStatus();
		}

		@Override
		public void setValue(TradeClearing2 obj, Optional<Cleared3Choice> value) {
			obj.setClearingStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "IntraGrp")
	protected TrueFalseIndicator intraGroup;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeClearing2 TradeClearing2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntraGrp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntraGroup"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the contract was entered into as an intragroup transaction.\r\n\r\nUsage: When absent, default value is false."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeClearing2, Optional<TrueFalseIndicator>> mmIntraGroup = new MMMessageAttribute<TradeClearing2, Optional<TrueFalseIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeClearing2.mmObject();
			isDerived = false;
			xmlTag = "IntraGrp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntraGroup";
			definition = "Indicates whether the contract was entered into as an intragroup transaction.\r\n\r\nUsage: When absent, default value is false.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(TradeClearing2 obj) {
			return obj.getIntraGroup();
		}

		@Override
		public void setValue(TradeClearing2 obj, Optional<TrueFalseIndicator> value) {
			obj.setIntraGroup(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeClearing2.mmClearingObligation, com.tools20022.repository.msg.TradeClearing2.mmClearingStatus,
						com.tools20022.repository.msg.TradeClearing2.mmIntraGroup);
				trace_lazy = () -> SecuritiesClearing.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOneElementPresentRule.forTradeClearing2);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "TradeClearing2";
				definition = "Information related to the clearing of the contract.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ClearingObligationType1Code> getClearingObligation() {
		return clearingObligation == null ? Optional.empty() : Optional.of(clearingObligation);
	}

	public TradeClearing2 setClearingObligation(ClearingObligationType1Code clearingObligation) {
		this.clearingObligation = clearingObligation;
		return this;
	}

	public Optional<Cleared3Choice> getClearingStatus() {
		return clearingStatus == null ? Optional.empty() : Optional.of(clearingStatus);
	}

	public TradeClearing2 setClearingStatus(Cleared3Choice clearingStatus) {
		this.clearingStatus = clearingStatus;
		return this;
	}

	public Optional<TrueFalseIndicator> getIntraGroup() {
		return intraGroup == null ? Optional.empty() : Optional.of(intraGroup);
	}

	public TradeClearing2 setIntraGroup(TrueFalseIndicator intraGroup) {
		this.intraGroup = intraGroup;
		return this;
	}
}