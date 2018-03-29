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

package com.tools20022.repository.area.other;

import com.tools20022.metamodel.ext.OtherSemanticMarkup;
import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.OtherMessages;
import com.tools20022.repository.choice.PartyIdentification97Choice;
import com.tools20022.repository.choice.TradeReportQuery3Choice;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.FinancialInstrumentsandTransactionsRegulatoryReportingTradeRepositoryReporting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * The DerivativesTradeReportQuery message is sent by the supervisory authority
 * system to the trade repositories, to query data based on the search criteria
 * for the trade transaction as defined by the system user.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.DerivativesTradeReportQueryV01#mmRequestingAuthority
 * DerivativesTradeReportQueryV01.mmRequestingAuthority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.DerivativesTradeReportQueryV01#mmTradeQueryData
 * DerivativesTradeReportQueryV01.mmTradeQueryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.DerivativesTradeReportQueryV01#mmSupplementaryData
 * DerivativesTradeReportQueryV01.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.FinancialInstrumentsandTransactionsRegulatoryReportingTradeRepositoryReporting 
 * FinancialInstrumentsandTransactionsRegulatoryReportingTradeRepositoryReporting
 * }</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "DerivsTradRptQry"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} = {@linkplain com.tools20022.repository.area.OtherMessages
 * OtherMessages}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code auth.029.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = type=prefix, prefix=DRAFT10</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DerivativesTradeReportQueryV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The DerivativesTradeReportQuery message is sent by the supervisory authority system to the trade repositories, to query data based on the search criteria for the trade transaction as defined by the system user."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DerivativesTradeReportQueryV01", propOrder = {"requestingAuthority", "tradeQueryData", "supplementaryData"})
public class DerivativesTradeReportQueryV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RqstngAuthrty", required = true)
	protected PartyIdentification97Choice requestingAuthority;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification97Choice
	 * PartyIdentification97Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RqstngAuthrty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestingAuthority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the authority that requests the query report."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<DerivativesTradeReportQueryV01, PartyIdentification97Choice> mmRequestingAuthority = new MMMessageBuildingBlock<DerivativesTradeReportQueryV01, PartyIdentification97Choice>() {
		{
			xmlTag = "RqstngAuthrty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestingAuthority";
			definition = "Indicates the authority that requests the query report.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification97Choice.mmObject();
		}

		@Override
		public PartyIdentification97Choice getValue(DerivativesTradeReportQueryV01 obj) {
			return obj.getRequestingAuthority();
		}

		@Override
		public void setValue(DerivativesTradeReportQueryV01 obj, PartyIdentification97Choice value) {
			obj.setRequestingAuthority(value);
		}
	};
	@XmlElement(name = "TradQryData", required = true)
	protected TradeReportQuery3Choice tradeQueryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.TradeReportQuery3Choice
	 * TradeReportQuery3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradQryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeQueryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Criteria for defining recurrent and ad-hoc queries."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<DerivativesTradeReportQueryV01, TradeReportQuery3Choice> mmTradeQueryData = new MMMessageBuildingBlock<DerivativesTradeReportQueryV01, TradeReportQuery3Choice>() {
		{
			xmlTag = "TradQryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeQueryData";
			definition = "Criteria for defining recurrent and ad-hoc queries.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TradeReportQuery3Choice.mmObject();
		}

		@Override
		public TradeReportQuery3Choice getValue(DerivativesTradeReportQueryV01 obj) {
			return obj.getTradeQueryData();
		}

		@Override
		public void setValue(DerivativesTradeReportQueryV01 obj, TradeReportQuery3Choice value) {
			obj.setTradeQueryData(value);
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that can not be captured in the structured fields and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<DerivativesTradeReportQueryV01, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<DerivativesTradeReportQueryV01, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(DerivativesTradeReportQueryV01 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(DerivativesTradeReportQueryV01 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				semanticMarkup_lazy = () -> Arrays.asList(new OtherSemanticMarkup(this, "prefix", new String[]{"prefix", "DRAFT10"}));
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "DerivativesTradeReportQueryV01";
				definition = "The DerivativesTradeReportQuery message is sent by the supervisory authority system to the trade repositories, to query data based on the search criteria for the trade transaction as defined by the system user.";
				messageSet_lazy = () -> Arrays.asList(FinancialInstrumentsandTransactionsRegulatoryReportingTradeRepositoryReporting.mmObject());
				rootElement = "Document";
				xmlTag = "DerivsTradRptQry";
				businessArea_lazy = () -> OtherMessages.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.other.DerivativesTradeReportQueryV01.mmRequestingAuthority,
						com.tools20022.repository.area.other.DerivativesTradeReportQueryV01.mmTradeQueryData, com.tools20022.repository.area.other.DerivativesTradeReportQueryV01.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "auth";
						messageFunctionality = "029";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return DerivativesTradeReportQueryV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public PartyIdentification97Choice getRequestingAuthority() {
		return requestingAuthority;
	}

	public DerivativesTradeReportQueryV01 setRequestingAuthority(PartyIdentification97Choice requestingAuthority) {
		this.requestingAuthority = Objects.requireNonNull(requestingAuthority);
		return this;
	}

	public TradeReportQuery3Choice getTradeQueryData() {
		return tradeQueryData;
	}

	public DerivativesTradeReportQueryV01 setTradeQueryData(TradeReportQuery3Choice tradeQueryData) {
		this.tradeQueryData = Objects.requireNonNull(tradeQueryData);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public DerivativesTradeReportQueryV01 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.029.001.01")
	static public class Document {
		@XmlElement(name = "DerivsTradRptQry", required = true)
		public DerivativesTradeReportQueryV01 messageBody;
	}
}