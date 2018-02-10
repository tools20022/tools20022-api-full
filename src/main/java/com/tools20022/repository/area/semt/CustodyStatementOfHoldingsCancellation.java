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

package com.tools20022.repository.area.semt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesManagementPreviousVersion;
import com.tools20022.repository.msg.AdditionalReference2;
import com.tools20022.repository.msg.CustodyStatementOfHoldings1;
import com.tools20022.repository.msg.Pagination;
import com.tools20022.repository.msgset.ISOArchive;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The CustodyStatementOfHoldingsCancellation message is sent by an account
 * servicer to the account owner or the account owner's designated agent. The
 * account servicer may be a local agent (sub-custodian) acting on behalf of its
 * global custodian customer, a custodian acting on behalf of an investment
 * management institution or a broker/dealer, a fund administrator or fund
 * intermediary, trustee or registrar, etc.<br>
 * This message is used to cancel a previously sent CustodyStatementOfHoldings
 * message.<br>
 * <b>Usage</b><br>
 * The CustodyStatementOfHoldingsCancellation message is sent by an account
 * servicer to the account owner to cancel a previously sent
 * CustodyStatementOfHoldings message.<br>
 * This message must contain the reference of the message to be cancelled. This
 * message may also contain details of the message to be cancelled, but this is
 * not recommended.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsCancellation#mmPreviousReference
 * CustodyStatementOfHoldingsCancellation.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsCancellation#mmRelatedReference
 * CustodyStatementOfHoldingsCancellation.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsCancellation#mmMessagePagination
 * CustodyStatementOfHoldingsCancellation.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsCancellation#mmStatementToBeCancelled
 * CustodyStatementOfHoldingsCancellation.mmStatementToBeCancelled}</li>
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
 * xmlTag} = "semt.004.001.01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesManagementPreviousVersion
 * SecuritiesManagementPreviousVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlName
 * xmlName} = "semt.004.001.01"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code semt.004.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CustodyStatementOfHoldingsCancellation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe CustodyStatementOfHoldingsCancellation message is sent by an account servicer to the account owner or the account owner's designated agent. The account servicer may be a local agent (sub-custodian) acting on behalf of its global custodian customer, a custodian acting on behalf of an investment management institution or a broker/dealer, a fund administrator or fund intermediary, trustee or registrar, etc.\r\nThis message is used to cancel a previously sent CustodyStatementOfHoldings message.\r\nUsage\r\nThe CustodyStatementOfHoldingsCancellation message is sent by an account servicer to the account owner to cancel a previously sent CustodyStatementOfHoldings message.\r\nThis message must contain the reference of the message to be cancelled. This message may also contain details of the message to be cancelled, but this is not recommended."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsCancellationV02
 * CustodyStatementOfHoldingsCancellationV02}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "semt.004.001.01", propOrder = {"previousReference", "relatedReference", "messagePagination", "statementToBeCancelled"})
public class CustodyStatementOfHoldingsCancellation {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PrvsRef", required = true)
	protected AdditionalReference2 previousReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference2
	 * AdditionalReference2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference to a linked message that was previously sent."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPreviousReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "PrvsRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReference";
			definition = "Reference to a linked message that was previously sent.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AdditionalReference2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CustodyStatementOfHoldingsCancellation.class.getMethod("getPreviousReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "RltdRef")
	protected AdditionalReference2 relatedReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference2
	 * AdditionalReference2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to a linked message that was previously received."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRelatedReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "RltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Reference to a linked message that was previously received.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CustodyStatementOfHoldingsCancellation.class.getMethod("getRelatedReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "MsgPgntn", required = true)
	protected Pagination messagePagination;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Pagination
	 * Pagination}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgPgntn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessagePagination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number used to sequence pages when it is not possible for data to be conveyed in a single message and the data has to be split across several pages (messages)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessagePagination = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgPgntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessagePagination";
			definition = "Number used to sequence pages when it is not possible for data to be conveyed in a single message and the data has to be split across several pages (messages).";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Pagination.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CustodyStatementOfHoldingsCancellation.class.getMethod("getMessagePagination", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "StmtToBeCanc")
	protected CustodyStatementOfHoldings1 statementToBeCancelled;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CustodyStatementOfHoldings1
	 * CustodyStatementOfHoldings1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtToBeCanc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementToBeCancelled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The Custody Statement of Holdings message to cancel."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmStatementToBeCancelled = new MMMessageBuildingBlock() {
		{
			xmlTag = "StmtToBeCanc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementToBeCancelled";
			definition = "The Custody Statement of Holdings message to cancel.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CustodyStatementOfHoldings1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CustodyStatementOfHoldingsCancellation.class.getMethod("getStatementToBeCancelled", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CustodyStatementOfHoldingsCancellation";
				definition = "Scope\r\nThe CustodyStatementOfHoldingsCancellation message is sent by an account servicer to the account owner or the account owner's designated agent. The account servicer may be a local agent (sub-custodian) acting on behalf of its global custodian customer, a custodian acting on behalf of an investment management institution or a broker/dealer, a fund administrator or fund intermediary, trustee or registrar, etc.\r\nThis message is used to cancel a previously sent CustodyStatementOfHoldings message.\r\nUsage\r\nThe CustodyStatementOfHoldingsCancellation message is sent by an account servicer to the account owner to cancel a previously sent CustodyStatementOfHoldings message.\r\nThis message must contain the reference of the message to be cancelled. This message may also contain details of the message to be cancelled, but this is not recommended.";
				nextVersions_lazy = () -> Arrays.asList(CustodyStatementOfHoldingsCancellationV02.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "semt.004.001.01";
				businessArea_lazy = () -> SecuritiesManagementPreviousVersion.mmObject();
				xmlName = "semt.004.001.01";
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.semt.CustodyStatementOfHoldingsCancellation.mmPreviousReference,
						com.tools20022.repository.area.semt.CustodyStatementOfHoldingsCancellation.mmRelatedReference, com.tools20022.repository.area.semt.CustodyStatementOfHoldingsCancellation.mmMessagePagination,
						com.tools20022.repository.area.semt.CustodyStatementOfHoldingsCancellation.mmStatementToBeCancelled);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "semt";
						messageFunctionality = "004";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CustodyStatementOfHoldingsCancellation.class;
			}
		});
		return mmObject_lazy.get();
	}

	public AdditionalReference2 getPreviousReference() {
		return previousReference;
	}

	public CustodyStatementOfHoldingsCancellation setPreviousReference(AdditionalReference2 previousReference) {
		this.previousReference = Objects.requireNonNull(previousReference);
		return this;
	}

	public Optional<AdditionalReference2> getRelatedReference() {
		return relatedReference == null ? Optional.empty() : Optional.of(relatedReference);
	}

	public CustodyStatementOfHoldingsCancellation setRelatedReference(AdditionalReference2 relatedReference) {
		this.relatedReference = relatedReference;
		return this;
	}

	public Pagination getMessagePagination() {
		return messagePagination;
	}

	public CustodyStatementOfHoldingsCancellation setMessagePagination(Pagination messagePagination) {
		this.messagePagination = Objects.requireNonNull(messagePagination);
		return this;
	}

	public Optional<CustodyStatementOfHoldings1> getStatementToBeCancelled() {
		return statementToBeCancelled == null ? Optional.empty() : Optional.of(statementToBeCancelled);
	}

	public CustodyStatementOfHoldingsCancellation setStatementToBeCancelled(CustodyStatementOfHoldings1 statementToBeCancelled) {
		this.statementToBeCancelled = statementToBeCancelled;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.004.001.01")
	static public class Document {
		@XmlElement(name = "semt.004.001.01", required = true)
		public CustodyStatementOfHoldingsCancellation messageBody;
	}
}