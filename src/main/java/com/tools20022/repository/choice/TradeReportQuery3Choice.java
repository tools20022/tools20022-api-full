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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.other.DerivativesTradeReportQueryV01;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.TradeQueryCriteria3;
import com.tools20022.repository.msg.TradeRecurrentQuery2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines the type of the query, a recurrent or an ad-hoc query.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TradeReportQuery3Choice#mmAdHocQuery
 * TradeReportQuery3Choice.mmAdHocQuery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TradeReportQuery3Choice#mmRecurrentQuery
 * TradeReportQuery3Choice.mmRecurrentQuery}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.DerivativesTradeReportQueryV01#mmTradeQueryData
 * DerivativesTradeReportQueryV01.mmTradeQueryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeReportQuery3Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines the type of the query, a recurrent or an ad-hoc query."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TradeReportQuery3Choice", propOrder = {"adHocQuery", "recurrentQuery"})
public class TradeReportQuery3Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AdHocQry", required = true)
	protected TradeQueryCriteria3 adHocQuery;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradeQueryCriteria3
	 * TradeQueryCriteria3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TradeReportQuery3Choice
	 * TradeReportQuery3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AdHocQry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdHocQuery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Query criteria specifically applied to ad-hoc queries."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeReportQuery3Choice, TradeQueryCriteria3> mmAdHocQuery = new MMMessageAssociationEnd<TradeReportQuery3Choice, TradeQueryCriteria3>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.TradeReportQuery3Choice.mmObject();
			isDerived = false;
			xmlTag = "AdHocQry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdHocQuery";
			definition = "Query criteria specifically applied to ad-hoc queries.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TradeQueryCriteria3.mmObject();
		}

		@Override
		public TradeQueryCriteria3 getValue(TradeReportQuery3Choice obj) {
			return obj.getAdHocQuery();
		}

		@Override
		public void setValue(TradeReportQuery3Choice obj, TradeQueryCriteria3 value) {
			obj.setAdHocQuery(value);
		}
	};
	@XmlElement(name = "RcrntQry", required = true)
	protected TradeRecurrentQuery2 recurrentQuery;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradeRecurrentQuery2
	 * TradeRecurrentQuery2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TradeReportQuery3Choice
	 * TradeReportQuery3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcrntQry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecurrentQuery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Query criteria specifically applied to recurrent queries."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeReportQuery3Choice, TradeRecurrentQuery2> mmRecurrentQuery = new MMMessageAssociationEnd<TradeReportQuery3Choice, TradeRecurrentQuery2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.TradeReportQuery3Choice.mmObject();
			isDerived = false;
			xmlTag = "RcrntQry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecurrentQuery";
			definition = "Query criteria specifically applied to recurrent queries.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TradeRecurrentQuery2.mmObject();
		}

		@Override
		public TradeRecurrentQuery2 getValue(TradeReportQuery3Choice obj) {
			return obj.getRecurrentQuery();
		}

		@Override
		public void setValue(TradeReportQuery3Choice obj, TradeRecurrentQuery2 value) {
			obj.setRecurrentQuery(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.TradeReportQuery3Choice.mmAdHocQuery, com.tools20022.repository.choice.TradeReportQuery3Choice.mmRecurrentQuery);
				messageBuildingBlock_lazy = () -> Arrays.asList(DerivativesTradeReportQueryV01.mmTradeQueryData);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "TradeReportQuery3Choice";
				definition = "Defines the type of the query, a recurrent or an ad-hoc query.";
			}
		});
		return mmObject_lazy.get();
	}

	public TradeQueryCriteria3 getAdHocQuery() {
		return adHocQuery;
	}

	public TradeReportQuery3Choice setAdHocQuery(TradeQueryCriteria3 adHocQuery) {
		this.adHocQuery = Objects.requireNonNull(adHocQuery);
		return this;
	}

	public TradeRecurrentQuery2 getRecurrentQuery() {
		return recurrentQuery;
	}

	public TradeReportQuery3Choice setRecurrentQuery(TradeRecurrentQuery2 recurrentQuery) {
		this.recurrentQuery = Objects.requireNonNull(recurrentQuery);
		return this;
	}
}