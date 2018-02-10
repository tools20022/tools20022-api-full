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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.other.DerivativesTradeReportV01;
import com.tools20022.repository.codeset.ReportPeriodActivity1Code;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.TradeStateReport3;
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
 * Position/transaction reporting under EMIR regulation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TradeData3Choice#mmDataSetAction
 * TradeData3Choice.mmDataSetAction}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TradeData3Choice#mmReport
 * TradeData3Choice.mmReport}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TradeData3Choice#mmState
 * TradeData3Choice.mmState}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.DerivativesTradeReportV01#mmTradeData
 * DerivativesTradeReportV01.mmTradeData}</li>
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
 * "TradeData3Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Position/transaction reporting under EMIR regulation."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TradeData3Choice", propOrder = {"dataSetAction", "report", "state"})
public class TradeData3Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DataSetActn", required = true)
	protected ReportPeriodActivity1Code dataSetAction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ReportPeriodActivity1Code
	 * ReportPeriodActivity1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TradeData3Choice
	 * TradeData3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DataSetActn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataSetAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Where no trades meet the query criteria, this field should be set so that a valid response can be submitted and the user can be informed on the successful query execution but with no records in the response."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDataSetAction = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.TradeData3Choice.mmObject();
			isDerived = false;
			xmlTag = "DataSetActn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSetAction";
			definition = "Where no trades meet the query criteria, this field should be set so that a valid response can be submitted and the user can be informed on the successful query execution but with no records in the response.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ReportPeriodActivity1Code.mmObject();
		}
	};
	@XmlElement(name = "Rpt", required = true)
	protected List<com.tools20022.repository.choice.TradeReport3Choice> report;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.TradeReport3Choice
	 * TradeReport3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TradeData3Choice
	 * TradeData3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Report"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reporting of position or transaction for trade lifecycle events, under EMIR regulation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReport = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.TradeData3Choice.mmObject();
			isDerived = false;
			xmlTag = "Rpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Report";
			definition = "Reporting of position or transaction for trade lifecycle events, under EMIR regulation.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.TradeReport3Choice.mmObject();
		}
	};
	@XmlElement(name = "Stat", required = true)
	protected List<TradeStateReport3> state;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradeStateReport3
	 * TradeStateReport3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TradeData3Choice
	 * TradeData3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Stat"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "State"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to trade state reporting."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmState = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.TradeData3Choice.mmObject();
			isDerived = false;
			xmlTag = "Stat";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "State";
			definition = "Information related to trade state reporting.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TradeStateReport3.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.TradeData3Choice.mmDataSetAction, com.tools20022.repository.choice.TradeData3Choice.mmReport,
						com.tools20022.repository.choice.TradeData3Choice.mmState);
				messageBuildingBlock_lazy = () -> Arrays.asList(DerivativesTradeReportV01.mmTradeData);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "TradeData3Choice";
				definition = "Position/transaction reporting under EMIR regulation.";
			}
		});
		return mmObject_lazy.get();
	}

	public ReportPeriodActivity1Code getDataSetAction() {
		return dataSetAction;
	}

	public TradeData3Choice setDataSetAction(ReportPeriodActivity1Code dataSetAction) {
		this.dataSetAction = Objects.requireNonNull(dataSetAction);
		return this;
	}

	public List<TradeReport3Choice> getReport() {
		return report == null ? report = new ArrayList<>() : report;
	}

	public TradeData3Choice setReport(List<com.tools20022.repository.choice.TradeReport3Choice> report) {
		this.report = Objects.requireNonNull(report);
		return this;
	}

	public List<TradeStateReport3> getState() {
		return state == null ? state = new ArrayList<>() : state;
	}

	public TradeData3Choice setState(List<TradeStateReport3> state) {
		this.state = Objects.requireNonNull(state);
		return this;
	}
}