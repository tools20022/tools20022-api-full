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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.ActionType4Code;
import com.tools20022.repository.codeset.CardTransactionRiskReason1Code;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Indicates to the issuer the level of risk of the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionRiskIndicator1#mmReason
 * CardTransactionRiskIndicator1.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionRiskIndicator1#mmLevel
 * CardTransactionRiskIndicator1.mmLevel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionRiskIndicator1#mmRecommendedAction
 * CardTransactionRiskIndicator1.mmRecommendedAction}</li>
 * </ul>
 * </li>
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
 * "CardTransactionRiskIndicator1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Indicates to the issuer the level of risk of the transaction."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardTransactionRiskIndicator1", propOrder = {"reason", "level", "recommendedAction"})
public class CardTransactionRiskIndicator1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Rsn")
	protected List<CardTransactionRiskReason1Code> reason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code
	 * CardTransactionRiskReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionRiskIndicator1
	 * CardTransactionRiskIndicator1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason to indicate a certain level of risk for the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardTransactionRiskIndicator1, List<CardTransactionRiskReason1Code>> mmReason = new MMMessageAttribute<CardTransactionRiskIndicator1, List<CardTransactionRiskReason1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionRiskIndicator1.mmObject();
			isDerived = false;
			xmlTag = "Rsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reason";
			definition = "Reason to indicate a certain level of risk for the transaction.";
			minOccurs = 0;
			simpleType_lazy = () -> CardTransactionRiskReason1Code.mmObject();
		}

		@Override
		public List<CardTransactionRiskReason1Code> getValue(CardTransactionRiskIndicator1 obj) {
			return obj.getReason();
		}

		@Override
		public void setValue(CardTransactionRiskIndicator1 obj, List<CardTransactionRiskReason1Code> value) {
			obj.setReason(value);
		}
	};
	@XmlElement(name = "Lvl", required = true)
	protected Number level;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionRiskIndicator1
	 * CardTransactionRiskIndicator1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Lvl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Level"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Level of risk, from 1 to 99."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardTransactionRiskIndicator1, Number> mmLevel = new MMMessageAttribute<CardTransactionRiskIndicator1, Number>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionRiskIndicator1.mmObject();
			isDerived = false;
			xmlTag = "Lvl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Level";
			definition = "Level of risk, from 1 to 99.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(CardTransactionRiskIndicator1 obj) {
			return obj.getLevel();
		}

		@Override
		public void setValue(CardTransactionRiskIndicator1 obj, Number value) {
			obj.setLevel(value);
		}
	};
	@XmlElement(name = "RcmmnddActn")
	protected List<ActionType4Code> recommendedAction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType4Code
	 * ActionType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionRiskIndicator1
	 * CardTransactionRiskIndicator1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcmmnddActn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecommendedAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Recommended action for the issuer."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardTransactionRiskIndicator1, List<ActionType4Code>> mmRecommendedAction = new MMMessageAttribute<CardTransactionRiskIndicator1, List<ActionType4Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionRiskIndicator1.mmObject();
			isDerived = false;
			xmlTag = "RcmmnddActn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecommendedAction";
			definition = "Recommended action for the issuer.";
			minOccurs = 0;
			simpleType_lazy = () -> ActionType4Code.mmObject();
		}

		@Override
		public List<ActionType4Code> getValue(CardTransactionRiskIndicator1 obj) {
			return obj.getRecommendedAction();
		}

		@Override
		public void setValue(CardTransactionRiskIndicator1 obj, List<ActionType4Code> value) {
			obj.setRecommendedAction(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardTransactionRiskIndicator1.mmReason, com.tools20022.repository.msg.CardTransactionRiskIndicator1.mmLevel,
						com.tools20022.repository.msg.CardTransactionRiskIndicator1.mmRecommendedAction);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardTransactionRiskIndicator1";
				definition = "Indicates to the issuer the level of risk of the transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<CardTransactionRiskReason1Code> getReason() {
		return reason == null ? reason = new ArrayList<>() : reason;
	}

	public CardTransactionRiskIndicator1 setReason(List<CardTransactionRiskReason1Code> reason) {
		this.reason = Objects.requireNonNull(reason);
		return this;
	}

	public Number getLevel() {
		return level;
	}

	public CardTransactionRiskIndicator1 setLevel(Number level) {
		this.level = Objects.requireNonNull(level);
		return this;
	}

	public List<ActionType4Code> getRecommendedAction() {
		return recommendedAction == null ? recommendedAction = new ArrayList<>() : recommendedAction;
	}

	public CardTransactionRiskIndicator1 setRecommendedAction(List<ActionType4Code> recommendedAction) {
		this.recommendedAction = Objects.requireNonNull(recommendedAction);
		return this;
	}
}