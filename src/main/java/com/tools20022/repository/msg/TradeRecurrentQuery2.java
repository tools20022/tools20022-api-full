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
import com.tools20022.repository.choice.TradeQueryExecutionFrequency1Choice;
import com.tools20022.repository.codeset.TradeRecurrentQuery1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Recurrent query criteria.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeRecurrentQuery2#mmQueryType
 * TradeRecurrentQuery2.mmQueryType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeRecurrentQuery2#mmFrequency
 * TradeRecurrentQuery2.mmFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeRecurrentQuery2#mmValidUntil
 * TradeRecurrentQuery2.mmValidUntil}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeRecurrentQuery2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Recurrent query criteria."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TradeRecurrentQuery2", propOrder = {"queryType", "frequency", "validUntil"})
public class TradeRecurrentQuery2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "QryTp", required = true)
	protected TradeRecurrentQuery1Code queryType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradeRecurrentQuery1Code
	 * TradeRecurrentQuery1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeRecurrentQuery2
	 * TradeRecurrentQuery2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QryTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the type of recurrent query which is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeRecurrentQuery2, TradeRecurrentQuery1Code> mmQueryType = new MMMessageAttribute<TradeRecurrentQuery2, TradeRecurrentQuery1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeRecurrentQuery2.mmObject();
			isDerived = false;
			xmlTag = "QryTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryType";
			definition = "Defines the type of recurrent query which is requested.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradeRecurrentQuery1Code.mmObject();
		}

		@Override
		public TradeRecurrentQuery1Code getValue(TradeRecurrentQuery2 obj) {
			return obj.getQueryType();
		}

		@Override
		public void setValue(TradeRecurrentQuery2 obj, TradeRecurrentQuery1Code value) {
			obj.setQueryType(value);
		}
	};
	@XmlElement(name = "Frqcy", required = true)
	protected TradeQueryExecutionFrequency1Choice frequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TradeQueryExecutionFrequency1Choice
	 * TradeQueryExecutionFrequency1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeRecurrentQuery2
	 * TradeRecurrentQuery2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Frqcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Frequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the requested frequency of the recurrent query."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeRecurrentQuery2, TradeQueryExecutionFrequency1Choice> mmFrequency = new MMMessageAssociationEnd<TradeRecurrentQuery2, TradeQueryExecutionFrequency1Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeRecurrentQuery2.mmObject();
			isDerived = false;
			xmlTag = "Frqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Frequency";
			definition = "Defines the requested frequency of the recurrent query.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TradeQueryExecutionFrequency1Choice.mmObject();
		}

		@Override
		public TradeQueryExecutionFrequency1Choice getValue(TradeRecurrentQuery2 obj) {
			return obj.getFrequency();
		}

		@Override
		public void setValue(TradeRecurrentQuery2 obj, TradeQueryExecutionFrequency1Choice value) {
			obj.setFrequency(value);
		}
	};
	@XmlElement(name = "VldUntil", required = true)
	protected ISODate validUntil;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeRecurrentQuery2
	 * TradeRecurrentQuery2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VldUntil"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidUntil"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the date until which the query will be executed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeRecurrentQuery2, ISODate> mmValidUntil = new MMMessageAttribute<TradeRecurrentQuery2, ISODate>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeRecurrentQuery2.mmObject();
			isDerived = false;
			xmlTag = "VldUntil";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidUntil";
			definition = "Defines the date until which the query will be executed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(TradeRecurrentQuery2 obj) {
			return obj.getValidUntil();
		}

		@Override
		public void setValue(TradeRecurrentQuery2 obj, ISODate value) {
			obj.setValidUntil(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeRecurrentQuery2.mmQueryType, com.tools20022.repository.msg.TradeRecurrentQuery2.mmFrequency,
						com.tools20022.repository.msg.TradeRecurrentQuery2.mmValidUntil);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "TradeRecurrentQuery2";
				definition = "Recurrent query criteria.";
			}
		});
		return mmObject_lazy.get();
	}

	public TradeRecurrentQuery1Code getQueryType() {
		return queryType;
	}

	public TradeRecurrentQuery2 setQueryType(TradeRecurrentQuery1Code queryType) {
		this.queryType = Objects.requireNonNull(queryType);
		return this;
	}

	public TradeQueryExecutionFrequency1Choice getFrequency() {
		return frequency;
	}

	public TradeRecurrentQuery2 setFrequency(TradeQueryExecutionFrequency1Choice frequency) {
		this.frequency = Objects.requireNonNull(frequency);
		return this;
	}

	public ISODate getValidUntil() {
		return validUntil;
	}

	public TradeRecurrentQuery2 setValidUntil(ISODate validUntil) {
		this.validUntil = Objects.requireNonNull(validUntil);
		return this;
	}
}