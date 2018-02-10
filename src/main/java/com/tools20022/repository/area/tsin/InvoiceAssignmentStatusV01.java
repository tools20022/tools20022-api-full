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

package com.tools20022.repository.area.tsin;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.TradeServicesInitiationLatestVersion;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.Max15NumericText;
import com.tools20022.repository.msg.BusinessLetter1;
import com.tools20022.repository.msg.EncapsulatedBusinessMessage1;
import com.tools20022.repository.msg.FinancingItemList1;
import com.tools20022.repository.msgset.FactoringServicesISOLatestversion;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * The message InvoiceAssignmentStatus is sent by a factoring service provider
 * to a factoring client and, optionally, to an interested party as a response
 * to assignments requests.<br>
 * The factoring service provider returns a copy of items of corresponding
 * requests together with an information about the status of treatment, for
 * example acceptance, rejection or treatment not yet finished. A rejection can
 * be the result of bad message syntax, but also for other motives such as risk,
 * compliance or covenants.<br>
 * For each reported financial item, the factoring service provider includes a
 * reference to the corresponding item of the InvoiceFinancingRequest message
 * and may include the referenced item as well as data from other related and
 * referenced messages.<br>
 * The message contains information about other parties to be notified and
 * whether these parties are required to acknowledge the assignment.<br>
 * The message can carry digital signatures if required by context.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceAssignmentStatusV01#mmHeader
 * InvoiceAssignmentStatusV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceAssignmentStatusV01#mmAssignmentList
 * InvoiceAssignmentStatusV01.mmAssignmentList}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceAssignmentStatusV01#mmAssignmentCount
 * InvoiceAssignmentStatusV01.mmAssignmentCount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceAssignmentStatusV01#mmItemCount
 * InvoiceAssignmentStatusV01.mmItemCount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceAssignmentStatusV01#mmControlSum
 * InvoiceAssignmentStatusV01.mmControlSum}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceAssignmentStatusV01#mmAttachedMessage
 * InvoiceAssignmentStatusV01.mmAttachedMessage}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.FactoringServicesISOLatestversion
 * FactoringServicesISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "InvcAssgnmtSts"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TradeServicesInitiationLatestVersion
 * TradeServicesInitiationLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code tsin.007.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvoiceAssignmentStatusV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The message InvoiceAssignmentStatus is sent by a factoring service provider to a factoring client and, optionally, to an interested party as a response to assignments requests.\r\nThe factoring service provider returns a copy of items of corresponding requests together with an information about the status of treatment, for example acceptance, rejection or treatment not yet finished. A rejection can be the result of bad message syntax, but also for other motives such as risk, compliance or covenants.\r\nFor each reported financial item, the factoring service provider includes a reference to the corresponding item of the InvoiceFinancingRequest message and may include the referenced item as well as data from other related and referenced messages.\r\nThe message contains information about other parties to be notified and whether these parties are required to acknowledge the assignment.\r\nThe message can carry digital signatures if required by context."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InvoiceAssignmentStatusV01", propOrder = {"header", "assignmentList", "assignmentCount", "itemCount", "controlSum", "attachedMessage"})
public class InvoiceAssignmentStatusV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Hdr", required = true)
	protected BusinessLetter1 header;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.BusinessLetter1
	 * BusinessLetter1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Hdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Header"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of characteristics that unambiguously identify the assignment status, common parameters, documents and identifications."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Set of characteristics that unambiguously identify the assignment status, common parameters, documents and identifications.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> BusinessLetter1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvoiceAssignmentStatusV01.class.getMethod("getHeader", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "AssgnmtList", required = true)
	protected List<FinancingItemList1> assignmentList;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancingItemList1
	 * FinancingItemList1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AssgnmtList"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssignmentList"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "List of assignments of financial items."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAssignmentList = new MMMessageBuildingBlock() {
		{
			xmlTag = "AssgnmtList";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssignmentList";
			definition = "List of assignments of financial items.";
			minOccurs = 1;
			complexType_lazy = () -> FinancingItemList1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvoiceAssignmentStatusV01.class.getMethod("getAssignmentList", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "AssgnmtCnt")
	protected Max15NumericText assignmentCount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15NumericText
	 * Max15NumericText}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AssgnmtCnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssignmentCount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of assignments."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAssignmentCount = new MMMessageBuildingBlock() {
		{
			xmlTag = "AssgnmtCnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssignmentCount";
			definition = "Number of assignments.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvoiceAssignmentStatusV01.class.getMethod("getAssignmentCount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "ItmCnt")
	protected Max15NumericText itemCount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15NumericText
	 * Max15NumericText}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ItmCnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ItemCount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total number of individual items in all assignments."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmItemCount = new MMMessageBuildingBlock() {
		{
			xmlTag = "ItmCnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ItemCount";
			definition = "Total number of individual items in all assignments.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvoiceAssignmentStatusV01.class.getMethod("getItemCount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "CtrlSum")
	protected DecimalNumber controlSum;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrlSum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ControlSum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total of all individual amounts included in all lists, irrespective of currencies or direction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmControlSum = new MMMessageBuildingBlock() {
		{
			xmlTag = "CtrlSum";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ControlSum";
			definition = "Total of all individual amounts included in all lists, irrespective of currencies or direction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvoiceAssignmentStatusV01.class.getMethod("getControlSum", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "AttchdMsg")
	protected List<EncapsulatedBusinessMessage1> attachedMessage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.EncapsulatedBusinessMessage1
	 * EncapsulatedBusinessMessage1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AttchdMsg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AttachedMessage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Referenced or related business message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAttachedMessage = new MMMessageBuildingBlock() {
		{
			xmlTag = "AttchdMsg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttachedMessage";
			definition = "Referenced or related business message.";
			minOccurs = 0;
			complexType_lazy = () -> EncapsulatedBusinessMessage1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvoiceAssignmentStatusV01.class.getMethod("getAttachedMessage", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvoiceAssignmentStatusV01";
				definition = "The message InvoiceAssignmentStatus is sent by a factoring service provider to a factoring client and, optionally, to an interested party as a response to assignments requests.\r\nThe factoring service provider returns a copy of items of corresponding requests together with an information about the status of treatment, for example acceptance, rejection or treatment not yet finished. A rejection can be the result of bad message syntax, but also for other motives such as risk, compliance or covenants.\r\nFor each reported financial item, the factoring service provider includes a reference to the corresponding item of the InvoiceFinancingRequest message and may include the referenced item as well as data from other related and referenced messages.\r\nThe message contains information about other parties to be notified and whether these parties are required to acknowledge the assignment.\r\nThe message can carry digital signatures if required by context.";
				messageSet_lazy = () -> Arrays.asList(FactoringServicesISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "InvcAssgnmtSts";
				businessArea_lazy = () -> TradeServicesInitiationLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsin.InvoiceAssignmentStatusV01.mmHeader, com.tools20022.repository.area.tsin.InvoiceAssignmentStatusV01.mmAssignmentList,
						com.tools20022.repository.area.tsin.InvoiceAssignmentStatusV01.mmAssignmentCount, com.tools20022.repository.area.tsin.InvoiceAssignmentStatusV01.mmItemCount,
						com.tools20022.repository.area.tsin.InvoiceAssignmentStatusV01.mmControlSum, com.tools20022.repository.area.tsin.InvoiceAssignmentStatusV01.mmAttachedMessage);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "tsin";
						messageFunctionality = "007";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return InvoiceAssignmentStatusV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public BusinessLetter1 getHeader() {
		return header;
	}

	public InvoiceAssignmentStatusV01 setHeader(BusinessLetter1 header) {
		this.header = Objects.requireNonNull(header);
		return this;
	}

	public List<FinancingItemList1> getAssignmentList() {
		return assignmentList == null ? assignmentList = new ArrayList<>() : assignmentList;
	}

	public InvoiceAssignmentStatusV01 setAssignmentList(List<FinancingItemList1> assignmentList) {
		this.assignmentList = Objects.requireNonNull(assignmentList);
		return this;
	}

	public Optional<Max15NumericText> getAssignmentCount() {
		return assignmentCount == null ? Optional.empty() : Optional.of(assignmentCount);
	}

	public InvoiceAssignmentStatusV01 setAssignmentCount(Max15NumericText assignmentCount) {
		this.assignmentCount = assignmentCount;
		return this;
	}

	public Optional<Max15NumericText> getItemCount() {
		return itemCount == null ? Optional.empty() : Optional.of(itemCount);
	}

	public InvoiceAssignmentStatusV01 setItemCount(Max15NumericText itemCount) {
		this.itemCount = itemCount;
		return this;
	}

	public Optional<DecimalNumber> getControlSum() {
		return controlSum == null ? Optional.empty() : Optional.of(controlSum);
	}

	public InvoiceAssignmentStatusV01 setControlSum(DecimalNumber controlSum) {
		this.controlSum = controlSum;
		return this;
	}

	public List<EncapsulatedBusinessMessage1> getAttachedMessage() {
		return attachedMessage == null ? attachedMessage = new ArrayList<>() : attachedMessage;
	}

	public InvoiceAssignmentStatusV01 setAttachedMessage(List<EncapsulatedBusinessMessage1> attachedMessage) {
		this.attachedMessage = Objects.requireNonNull(attachedMessage);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsin.007.001.01")
	static public class Document {
		@XmlElement(name = "InvcAssgnmtSts", required = true)
		public InvoiceAssignmentStatusV01 messageBody;
	}
}