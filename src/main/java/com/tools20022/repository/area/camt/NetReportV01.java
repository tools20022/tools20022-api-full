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

package com.tools20022.repository.area.camt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.CashManagementLatestVersion;
import com.tools20022.repository.choice.PartyIdentification73Choice;
import com.tools20022.repository.msg.NetObligation1;
import com.tools20022.repository.msg.NetReportData1;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.PostTradeForeignExchangeISOLatestversion;
import com.tools20022.repository.msgset.PostTradeForeignExchangeMaintenance20162017andSupplement;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * The Net Report message is sent to a participant by a central system to
 * provide details of the of the bi-lateral payment obligations, calculated by
 * the central system per currency.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NetReportV01#mmNetReportData
 * NetReportV01.mmNetReportData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NetReportV01#mmNetServiceParticipantIdentification
 * NetReportV01.mmNetServiceParticipantIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NetReportV01#mmNetServiceCounterpartyIdentification
 * NetReportV01.mmNetServiceCounterpartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NetReportV01#mmNetObligation
 * NetReportV01.mmNetObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NetReportV01#mmSupplementaryData
 * NetReportV01.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.PostTradeForeignExchangeISOLatestversion
 * PostTradeForeignExchangeISOLatestversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.PostTradeForeignExchangeMaintenance20162017andSupplement
 * PostTradeForeignExchangeMaintenance20162017andSupplement}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "NetRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementLatestVersion
 * CashManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.088.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCounterpartyIdentificationRule#forNetReportV01
 * ConstraintCounterpartyIdentificationRule.forNetReportV01}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NetReportV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The Net Report message is sent to a participant by a central system to provide details of the of the bi-lateral payment obligations, calculated by the central system per currency."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "NetReportV01", propOrder = {"netReportData", "netServiceParticipantIdentification", "netServiceCounterpartyIdentification", "netObligation", "supplementaryData"})
public class NetReportV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "NetRptData", required = true)
	protected NetReportData1 netReportData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.NetReportData1
	 * NetReportData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetRptData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetReportData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the meta data associated with the net report."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmNetReportData = new MMMessageBuildingBlock() {
		{
			xmlTag = "NetRptData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetReportData";
			definition = "Specifies the meta data associated with the net report.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> NetReportData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return NetReportV01.class.getMethod("getNetReportData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "NetSvcPtcptId", required = true)
	protected PartyIdentification73Choice netServiceParticipantIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification73Choice
	 * PartyIdentification73Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetSvcPtcptId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetServiceParticipantIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Describes the participant receiving the net report."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmNetServiceParticipantIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "NetSvcPtcptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetServiceParticipantIdentification";
			definition = "Describes the participant receiving the net report.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification73Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return NetReportV01.class.getMethod("getNetServiceParticipantIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "NetSvcCtrPtyId")
	protected PartyIdentification73Choice netServiceCounterpartyIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification73Choice
	 * PartyIdentification73Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetSvcCtrPtyId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetServiceCounterpartyIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Describes the counterparty participant involved in (all of) the obligations of the report."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmNetServiceCounterpartyIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "NetSvcCtrPtyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetServiceCounterpartyIdentification";
			definition = "Describes the counterparty participant involved in (all of) the obligations of the report.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification73Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return NetReportV01.class.getMethod("getNetServiceCounterpartyIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "NetOblgtn", required = true)
	protected List<NetObligation1> netObligation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.NetObligation1
	 * NetObligation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetOblgtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the amount, direct parties or netting groups involved in the obligation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmNetObligation = new MMMessageBuildingBlock() {
		{
			xmlTag = "NetOblgtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetObligation";
			definition = "Provides the amount, direct parties or netting groups involved in the obligation.";
			minOccurs = 1;
			complexType_lazy = () -> NetObligation1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return NetReportV01.class.getMethod("getNetObligation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return NetReportV01.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCounterpartyIdentificationRule.forNetReportV01);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NetReportV01";
				definition = "The Net Report message is sent to a participant by a central system to provide details of the of the bi-lateral payment obligations, calculated by the central system per currency.";
				messageSet_lazy = () -> Arrays.asList(PostTradeForeignExchangeISOLatestversion.mmObject(), PostTradeForeignExchangeMaintenance20162017andSupplement.mmObject());
				rootElement = "Document";
				xmlTag = "NetRpt";
				businessArea_lazy = () -> CashManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.NetReportV01.mmNetReportData, com.tools20022.repository.area.camt.NetReportV01.mmNetServiceParticipantIdentification,
						com.tools20022.repository.area.camt.NetReportV01.mmNetServiceCounterpartyIdentification, com.tools20022.repository.area.camt.NetReportV01.mmNetObligation,
						com.tools20022.repository.area.camt.NetReportV01.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "088";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return NetReportV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public NetReportData1 getNetReportData() {
		return netReportData;
	}

	public NetReportV01 setNetReportData(NetReportData1 netReportData) {
		this.netReportData = Objects.requireNonNull(netReportData);
		return this;
	}

	public PartyIdentification73Choice getNetServiceParticipantIdentification() {
		return netServiceParticipantIdentification;
	}

	public NetReportV01 setNetServiceParticipantIdentification(PartyIdentification73Choice netServiceParticipantIdentification) {
		this.netServiceParticipantIdentification = Objects.requireNonNull(netServiceParticipantIdentification);
		return this;
	}

	public Optional<PartyIdentification73Choice> getNetServiceCounterpartyIdentification() {
		return netServiceCounterpartyIdentification == null ? Optional.empty() : Optional.of(netServiceCounterpartyIdentification);
	}

	public NetReportV01 setNetServiceCounterpartyIdentification(PartyIdentification73Choice netServiceCounterpartyIdentification) {
		this.netServiceCounterpartyIdentification = netServiceCounterpartyIdentification;
		return this;
	}

	public List<NetObligation1> getNetObligation() {
		return netObligation == null ? netObligation = new ArrayList<>() : netObligation;
	}

	public NetReportV01 setNetObligation(List<NetObligation1> netObligation) {
		this.netObligation = Objects.requireNonNull(netObligation);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public NetReportV01 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.088.001.01")
	static public class Document {
		@XmlElement(name = "NetRpt", required = true)
		public NetReportV01 messageBody;
	}
}