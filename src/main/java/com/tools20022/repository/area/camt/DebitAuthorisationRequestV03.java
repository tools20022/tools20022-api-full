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
import com.tools20022.repository.area.CashManagementArchive;
import com.tools20022.repository.choice.UnderlyingTransaction1Choice;
import com.tools20022.repository.msg.Case2;
import com.tools20022.repository.msg.CaseAssignment2;
import com.tools20022.repository.msg.DebitAuthorisationDetails3;
import com.tools20022.repository.msgset.ISOArchive;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The Debit Authorisation Request message is sent by an account servicing
 * institution to an account owner. This message is used to request
 * authorisation to debit an account.<br>
 * <b>Usage</b><br>
 * The Debit Authorisation Request message must be answered with a Debit
 * Authorisation Response message.<br>
 * The Debit Authorisation Request message can be used to request debit
 * authorisation in a:<br>
 * - request to modify payment case (in the case of a lower final amount or
 * change of creditor)<br>
 * - request to cancel payment case (full amount)<br>
 * - unable to apply case (the creditor whose account has been credited is not
 * the intended beneficiary)<br>
 * - claim non receipt case (the creditor whose account has been credited is not
 * the intended beneficiary)<br>
 * The Debit Authorisation Request message covers one and only one payment
 * instruction at a time. If an account servicing institution needs to request
 * debit authorisation for several instructions, then multiple Debit
 * Authorisation Request messages must be sent.<br>
 * The Debit Authorisation Request must be used exclusively between the account
 * servicing institution and the account owner. It must not be used in place of
 * a Request To Modify Payment or Request To Cancel Payment message between
 * subsequent agents.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationRequestV03#mmAssignment
 * DebitAuthorisationRequestV03.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationRequestV03#mmCase
 * DebitAuthorisationRequestV03.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationRequestV03#mmUnderlying
 * DebitAuthorisationRequestV03.mmUnderlying}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationRequestV03#mmDetail
 * DebitAuthorisationRequestV03.mmDetail}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "DbtAuthstnReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementArchive
 * CashManagementArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.037.001.03}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DebitAuthorisationRequestV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe Debit Authorisation Request message is sent by an account servicing institution to an account owner. This message is used to request authorisation to debit an account.\r\nUsage\r\nThe Debit Authorisation Request message must be answered with a Debit Authorisation Response message.\r\nThe Debit Authorisation Request message can be used to request debit authorisation in a:\r\n- request to modify payment case (in the case of a lower final amount or change of creditor)\r\n- request to cancel payment case (full amount)\r\n- unable to apply case (the creditor whose account has been credited is not the intended beneficiary)\r\n- claim non receipt case (the creditor whose account has been credited is not the intended beneficiary)\r\nThe Debit Authorisation Request message covers one and only one payment instruction at a time. If an account servicing institution needs to request debit authorisation for several instructions, then multiple Debit Authorisation Request messages must be sent.\r\nThe Debit Authorisation Request must be used exclusively between the account servicing institution and the account owner. It must not be used in place of a Request To Modify Payment or Request To Cancel Payment message between subsequent agents."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationRequestV04
 * DebitAuthorisationRequestV04}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DebitAuthorisationRequestV03", propOrder = {"assignment", "case_", "underlying", "detail"})
public class DebitAuthorisationRequestV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Assgnmt", required = true)
	protected CaseAssignment2 assignment;
	/**
	 * 
	 <p>
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
	 * "Identifies the assignment of an investigation case from an assigner to an assignee.\nUsage: The Assigner must be the sender of this confirmation and the Assignee must be the receiver."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAssignment = new MMMessageBuildingBlock() {
		{
			xmlTag = "Assgnmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assignment";
			definition = "Identifies the assignment of an investigation case from an assigner to an assignee.\nUsage: The Assigner must be the sender of this confirmation and the Assignee must be the receiver.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CaseAssignment2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DebitAuthorisationRequestV03.class.getMethod("getAssignment", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "Case", required = true)
	protected Case2 case_;
	/**
	 * 
	 <p>
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
				return DebitAuthorisationRequestV03.class.getMethod("getCase", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "Undrlyg", required = true)
	protected UnderlyingTransaction1Choice underlying;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction1Choice
	 * UnderlyingTransaction1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Undrlyg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Underlying"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the underlying payment instructrion."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmUnderlying = new MMMessageBuildingBlock() {
		{
			xmlTag = "Undrlyg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Underlying";
			definition = "Identifies the underlying payment instructrion.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> UnderlyingTransaction1Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DebitAuthorisationRequestV03.class.getMethod("getUnderlying", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "Dtl", required = true)
	protected DebitAuthorisationDetails3 detail;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DebitAuthorisationDetails3
	 * DebitAuthorisationDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dtl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Detail"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Detailed information about the request."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmDetail = new MMMessageBuildingBlock() {
		{
			xmlTag = "Dtl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Detail";
			definition = "Detailed information about the request.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DebitAuthorisationDetails3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DebitAuthorisationRequestV03.class.getMethod("getDetail", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DebitAuthorisationRequestV03";
				definition = "Scope\r\nThe Debit Authorisation Request message is sent by an account servicing institution to an account owner. This message is used to request authorisation to debit an account.\r\nUsage\r\nThe Debit Authorisation Request message must be answered with a Debit Authorisation Response message.\r\nThe Debit Authorisation Request message can be used to request debit authorisation in a:\r\n- request to modify payment case (in the case of a lower final amount or change of creditor)\r\n- request to cancel payment case (full amount)\r\n- unable to apply case (the creditor whose account has been credited is not the intended beneficiary)\r\n- claim non receipt case (the creditor whose account has been credited is not the intended beneficiary)\r\nThe Debit Authorisation Request message covers one and only one payment instruction at a time. If an account servicing institution needs to request debit authorisation for several instructions, then multiple Debit Authorisation Request messages must be sent.\r\nThe Debit Authorisation Request must be used exclusively between the account servicing institution and the account owner. It must not be used in place of a Request To Modify Payment or Request To Cancel Payment message between subsequent agents.";
				nextVersions_lazy = () -> Arrays.asList(DebitAuthorisationRequestV04.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "DbtAuthstnReq";
				businessArea_lazy = () -> CashManagementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.DebitAuthorisationRequestV03.mmAssignment, com.tools20022.repository.area.camt.DebitAuthorisationRequestV03.mmCase,
						com.tools20022.repository.area.camt.DebitAuthorisationRequestV03.mmUnderlying, com.tools20022.repository.area.camt.DebitAuthorisationRequestV03.mmDetail);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "037";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return DebitAuthorisationRequestV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CaseAssignment2 getAssignment() {
		return assignment;
	}

	public DebitAuthorisationRequestV03 setAssignment(CaseAssignment2 assignment) {
		this.assignment = Objects.requireNonNull(assignment);
		return this;
	}

	public Case2 getCase() {
		return case_;
	}

	public DebitAuthorisationRequestV03 setCase(Case2 case_) {
		this.case_ = Objects.requireNonNull(case_);
		return this;
	}

	public UnderlyingTransaction1Choice getUnderlying() {
		return underlying;
	}

	public DebitAuthorisationRequestV03 setUnderlying(UnderlyingTransaction1Choice underlying) {
		this.underlying = Objects.requireNonNull(underlying);
		return this;
	}

	public DebitAuthorisationDetails3 getDetail() {
		return detail;
	}

	public DebitAuthorisationRequestV03 setDetail(DebitAuthorisationDetails3 detail) {
		this.detail = Objects.requireNonNull(detail);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.037.001.03")
	static public class Document {
		@XmlElement(name = "DbtAuthstnReq", required = true)
		public DebitAuthorisationRequestV03 messageBody;
	}
}