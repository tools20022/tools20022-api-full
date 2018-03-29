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

package com.tools20022.repository.area.acmt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.AccountManagementPreviousVersion;
import com.tools20022.repository.msg.IdentificationAssignment1;
import com.tools20022.repository.msg.IdentificationVerification1;
import com.tools20022.repository.msgset.ChangeorVerifyAccountIdentificationISOPreviousversion;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The IdentificationVerificationRequest message is sent by an assigner to an
 * assignee. It is used to request the verification of party and/or account
 * identification information.<br>
 * <b>Usage</b><br>
 * The IdentificationVerificationRequest message is sent before the sending of
 * one or several transactions messages.<br>
 * The IdentificationVerificationRequest message can contain one or more
 * verification requests.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.IdentificationVerificationRequestV01#mmAssignment
 * IdentificationVerificationRequestV01.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.IdentificationVerificationRequestV01#mmVerification
 * IdentificationVerificationRequestV01.mmVerification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.ChangeorVerifyAccountIdentificationISOPreviousversion
 * ChangeorVerifyAccountIdentificationISOPreviousversion}</li>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "IdVrfctnReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AccountManagementPreviousVersion
 * AccountManagementPreviousVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code acmt.023.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IdentificationVerificationRequestV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe IdentificationVerificationRequest message is sent by an assigner to an assignee. It is used to request the verification of party and/or account identification information.\r\nUsage\r\nThe IdentificationVerificationRequest message is sent before the sending of one or several transactions messages.\r\nThe IdentificationVerificationRequest message can contain one or more verification requests."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.IdentificationVerificationRequestV02
 * IdentificationVerificationRequestV02}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IdentificationVerificationRequestV01", propOrder = {"assignment", "verification"})
public class IdentificationVerificationRequestV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Assgnmt", required = true)
	protected IdentificationAssignment1 assignment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.IdentificationAssignment1
	 * IdentificationAssignment1}</li>
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
	 * definition} = "Identifies the identification assignment."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<IdentificationVerificationRequestV01, IdentificationAssignment1> mmAssignment = new MMMessageBuildingBlock<IdentificationVerificationRequestV01, IdentificationAssignment1>() {
		{
			xmlTag = "Assgnmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assignment";
			definition = "Identifies the identification assignment.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> IdentificationAssignment1.mmObject();
		}

		@Override
		public IdentificationAssignment1 getValue(IdentificationVerificationRequestV01 obj) {
			return obj.getAssignment();
		}

		@Override
		public void setValue(IdentificationVerificationRequestV01 obj, IdentificationAssignment1 value) {
			obj.setAssignment(value);
		}
	};
	@XmlElement(name = "Vrfctn", required = true)
	protected List<IdentificationVerification1> verification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.IdentificationVerification1
	 * IdentificationVerification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Vrfctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Verification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information concerning the identification data that is requested to be verified."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<IdentificationVerificationRequestV01, List<IdentificationVerification1>> mmVerification = new MMMessageBuildingBlock<IdentificationVerificationRequestV01, List<IdentificationVerification1>>() {
		{
			xmlTag = "Vrfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Verification";
			definition = "Information concerning the identification data that is requested to be verified.";
			minOccurs = 1;
			complexType_lazy = () -> IdentificationVerification1.mmObject();
		}

		@Override
		public List<IdentificationVerification1> getValue(IdentificationVerificationRequestV01 obj) {
			return obj.getVerification();
		}

		@Override
		public void setValue(IdentificationVerificationRequestV01 obj, List<IdentificationVerification1> value) {
			obj.setVerification(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IdentificationVerificationRequestV01";
				definition = "Scope\r\nThe IdentificationVerificationRequest message is sent by an assigner to an assignee. It is used to request the verification of party and/or account identification information.\r\nUsage\r\nThe IdentificationVerificationRequest message is sent before the sending of one or several transactions messages.\r\nThe IdentificationVerificationRequest message can contain one or more verification requests.";
				nextVersions_lazy = () -> Arrays.asList(IdentificationVerificationRequestV02.mmObject());
				messageSet_lazy = () -> Arrays.asList(ChangeorVerifyAccountIdentificationISOPreviousversion.mmObject(), ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "IdVrfctnReq";
				businessArea_lazy = () -> AccountManagementPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.IdentificationVerificationRequestV01.mmAssignment, com.tools20022.repository.area.acmt.IdentificationVerificationRequestV01.mmVerification);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "acmt";
						messageFunctionality = "023";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return IdentificationVerificationRequestV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public IdentificationAssignment1 getAssignment() {
		return assignment;
	}

	public IdentificationVerificationRequestV01 setAssignment(IdentificationAssignment1 assignment) {
		this.assignment = Objects.requireNonNull(assignment);
		return this;
	}

	public List<IdentificationVerification1> getVerification() {
		return verification == null ? verification = new ArrayList<>() : verification;
	}

	public IdentificationVerificationRequestV01 setVerification(List<IdentificationVerification1> verification) {
		this.verification = Objects.requireNonNull(verification);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:acmt.023.001.01")
	static public class Document {
		@XmlElement(name = "IdVrfctnReq", required = true)
		public IdentificationVerificationRequestV01 messageBody;
	}
}