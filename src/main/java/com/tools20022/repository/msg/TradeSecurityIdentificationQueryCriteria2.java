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
import com.tools20022.repository.choice.SecurityIdentificationQuery3Choice;
import com.tools20022.repository.codeset.Operation3Code;
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
 * Specifies the query criteria related to securities.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSecurityIdentificationQueryCriteria2#mmOperator
 * TradeSecurityIdentificationQueryCriteria2.mmOperator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSecurityIdentificationQueryCriteria2#mmIdentification
 * TradeSecurityIdentificationQueryCriteria2.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSecurityIdentificationQueryCriteria2#mmUnderlyingInstrumentIdentification
 * TradeSecurityIdentificationQueryCriteria2.
 * mmUnderlyingInstrumentIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOneElementPresentRule#forTradeSecurityIdentificationQueryCriteria2
 * ConstraintOneElementPresentRule.forTradeSecurityIdentificationQueryCriteria2}
 * </li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeSecurityIdentificationQueryCriteria2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the query criteria related to securities."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TradeSecurityIdentificationQueryCriteria2", propOrder = {"operator", "identification", "underlyingInstrumentIdentification"})
public class TradeSecurityIdentificationQueryCriteria2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Oprtr", required = true)
	protected Operation3Code operator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Operation3Code
	 * Operation3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSecurityIdentificationQueryCriteria2
	 * TradeSecurityIdentificationQueryCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Oprtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Operator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the AND/OR operators as query criteria."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOperator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeSecurityIdentificationQueryCriteria2.mmObject();
			isDerived = false;
			xmlTag = "Oprtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Operator";
			definition = "Specifies the AND/OR operators as query criteria.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Operation3Code.mmObject();
		}
	};
	@XmlElement(name = "Id")
	protected List<com.tools20022.repository.msg.SecurityIdentificationQueryCriteria1> identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentificationQueryCriteria1
	 * SecurityIdentificationQueryCriteria1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSecurityIdentificationQueryCriteria2
	 * TradeSecurityIdentificationQueryCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the product through ISIN or AII.\r\n"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeSecurityIdentificationQueryCriteria2.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of the product through ISIN or AII.\r\n";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecurityIdentificationQueryCriteria1.mmObject();
		}
	};
	@XmlElement(name = "UndrlygInstrmId")
	protected List<SecurityIdentificationQuery3Choice> underlyingInstrumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentificationQuery3Choice
	 * SecurityIdentificationQuery3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSecurityIdentificationQueryCriteria2
	 * TradeSecurityIdentificationQueryCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygInstrmId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification to identify the direct underlying instrument based on its type. \r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUnderlyingInstrumentIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeSecurityIdentificationQueryCriteria2.mmObject();
			isDerived = false;
			xmlTag = "UndrlygInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingInstrumentIdentification";
			definition = "Unique identification to identify the direct underlying instrument based on its type. \r\n";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecurityIdentificationQuery3Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeSecurityIdentificationQueryCriteria2.mmOperator, com.tools20022.repository.msg.TradeSecurityIdentificationQueryCriteria2.mmIdentification,
						com.tools20022.repository.msg.TradeSecurityIdentificationQueryCriteria2.mmUnderlyingInstrumentIdentification);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOneElementPresentRule.forTradeSecurityIdentificationQueryCriteria2);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "TradeSecurityIdentificationQueryCriteria2";
				definition = "Specifies the query criteria related to securities.";
			}
		});
		return mmObject_lazy.get();
	}

	public Operation3Code getOperator() {
		return operator;
	}

	public TradeSecurityIdentificationQueryCriteria2 setOperator(Operation3Code operator) {
		this.operator = Objects.requireNonNull(operator);
		return this;
	}

	public List<SecurityIdentificationQueryCriteria1> getIdentification() {
		return identification == null ? identification = new ArrayList<>() : identification;
	}

	public TradeSecurityIdentificationQueryCriteria2 setIdentification(List<com.tools20022.repository.msg.SecurityIdentificationQueryCriteria1> identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public List<SecurityIdentificationQuery3Choice> getUnderlyingInstrumentIdentification() {
		return underlyingInstrumentIdentification == null ? underlyingInstrumentIdentification = new ArrayList<>() : underlyingInstrumentIdentification;
	}

	public TradeSecurityIdentificationQueryCriteria2 setUnderlyingInstrumentIdentification(List<SecurityIdentificationQuery3Choice> underlyingInstrumentIdentification) {
		this.underlyingInstrumentIdentification = Objects.requireNonNull(underlyingInstrumentIdentification);
		return this;
	}
}