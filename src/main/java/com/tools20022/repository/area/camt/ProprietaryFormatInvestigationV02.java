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
import com.tools20022.repository.area.CashManagementPreviousVersion;
import com.tools20022.repository.msg.Case2;
import com.tools20022.repository.msg.CaseAssignment2;
import com.tools20022.repository.msg.ProprietaryData4;
import com.tools20022.repository.msgset.ISOArchive;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The Proprietary Format Investigation message type is used by financial
 * institutions, with their own offices, and/or with other financial
 * institutions with which they have established bilateral agreements.<br>
 * <b>Usage</b><br>
 * The user should ensure that an existing standard message cannot be used
 * before using the proprietary message.<br>
 * As defined in the scope, this ProprietaryFormatInvestigation message may only
 * be used when bilaterally agreed.<br>
 * It is used as an envelope for a non standard message and provides means to
 * manage an exception or investigation which falls outside the scope or
 * capability of any other formatted message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementPreviousVersion
 * CashManagementPreviousVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "PrtryFrmtInvstgtn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ProprietaryFormatInvestigationV02#mmAssignment
 * ProprietaryFormatInvestigationV02.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ProprietaryFormatInvestigationV02#mmCase
 * ProprietaryFormatInvestigationV02.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ProprietaryFormatInvestigationV02#mmProprietaryData
 * ProprietaryFormatInvestigationV02.mmProprietaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.035.001.02}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ProprietaryFormatInvestigationV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe Proprietary Format Investigation message type is used by financial institutions, with their own offices, and/or with other financial institutions with which they have established bilateral agreements.\r\nUsage\r\nThe user should ensure that an existing standard message cannot be used before using the proprietary message.\r\nAs defined in the scope, this ProprietaryFormatInvestigation message may only be used when bilaterally agreed.\r\nIt is used as an envelope for a non standard message and provides means to manage an exception or investigation which falls outside the scope or capability of any other formatted message."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ProprietaryFormatInvestigationV03
 * ProprietaryFormatInvestigationV03}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ProprietaryFormatInvestigationV02", propOrder = {"assignment", "case", "proprietaryData"})
public class ProprietaryFormatInvestigationV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected CaseAssignment2 assignment;
	/**
	 * Identifies the assignment of an investigation case from an assigner to an
	 * assignee. Usage Rule: the Assigner must be the sender of this
	 * confirmation and the Assignee must be the receiver.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CaseAssignment2
	 * CaseAssignment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Assgnmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assignment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the assignment of an investigation case from an assigner to an assignee.\nUsage Rule: the Assigner must be the sender of this confirmation and the Assignee must be the receiver."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAssignment = new MMMessageBuildingBlock() {
		{
			xmlTag = "Assgnmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assignment";
			definition = "Identifies the assignment of an investigation case from an assigner to an assignee.\nUsage Rule: the Assigner must be the sender of this confirmation and the Assignee must be the receiver.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CaseAssignment2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ProprietaryFormatInvestigationV02.class.getMethod("getAssignment", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Case2 case_;
	/**
	 * Identifies the investigation case.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Case2 Case2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Case"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Case"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the investigation case."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCase = new MMMessageBuildingBlock() {
		{
			xmlTag = "Case";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Case";
			definition = "Identifies the investigation case.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Case2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ProprietaryFormatInvestigationV02.class.getMethod("getCase", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ProprietaryData4 proprietaryData;
	/**
	 * Proprietary information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryData4
	 * ProprietaryData4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProprietaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Proprietary information."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmProprietaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "PrtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryData";
			definition = "Proprietary information.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ProprietaryData4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ProprietaryFormatInvestigationV02.class.getMethod("getProprietaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ProprietaryFormatInvestigationV02";
				definition = "Scope\r\nThe Proprietary Format Investigation message type is used by financial institutions, with their own offices, and/or with other financial institutions with which they have established bilateral agreements.\r\nUsage\r\nThe user should ensure that an existing standard message cannot be used before using the proprietary message.\r\nAs defined in the scope, this ProprietaryFormatInvestigation message may only be used when bilaterally agreed.\r\nIt is used as an envelope for a non standard message and provides means to manage an exception or investigation which falls outside the scope or capability of any other formatted message.";
				nextVersions_lazy = () -> Arrays.asList(ProprietaryFormatInvestigationV03.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "PrtryFrmtInvstgtn";
				businessArea_lazy = () -> CashManagementPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.ProprietaryFormatInvestigationV02.mmAssignment, com.tools20022.repository.area.camt.ProprietaryFormatInvestigationV02.mmCase,
						com.tools20022.repository.area.camt.ProprietaryFormatInvestigationV02.mmProprietaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "035";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ProprietaryFormatInvestigationV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Assgnmt", required = true)
	public CaseAssignment2 getAssignment() {
		return assignment;
	}

	public void setAssignment(CaseAssignment2 assignment) {
		this.assignment = assignment;
	}

	@XmlElement(name = "Case", required = true)
	public Case2 getCase() {
		return case_;
	}

	public void setCase(Case2 case_) {
		this.case_ = case_;
	}

	@XmlElement(name = "PrtryData", required = true)
	public ProprietaryData4 getProprietaryData() {
		return proprietaryData;
	}

	public void setProprietaryData(ProprietaryData4 proprietaryData) {
		this.proprietaryData = proprietaryData;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:camt.035.02.02")
	static public class Document {
		@XmlElement(name = "PrtryFrmtInvstgtn", required = true)
		public ProprietaryFormatInvestigationV02 messageBody;
	}
}