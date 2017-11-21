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

package com.tools20022.repository.area.setr;

import com.tools20022.metamodel.*;
import com.tools20022.repository.area.SecuritiesTradeArchive;
import com.tools20022.repository.msg.AdditionalReference3;
import com.tools20022.repository.msg.OrderStatusAndReason4;
import com.tools20022.repository.msgset.ISOArchive;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The OrderCancellationStatusReport is sent by an executing party, eg, a
 * transfer agent, to the instructing party, eg, an investment manager or its
 * authorised representative. There may be one or more intermediary parties
 * between the executing party and the instructing party. The intermediary party
 * is, for example, an intermediary or a concentrator.<br>
 * The message gives the status of an order cancellation instruction message
 * that was previously sent by the instructing party.<br>
 * <b>Usage</b><br>
 * The OrderCancellationStatusReport message is used to report the status of an
 * order cancellation instruction message that was previously sent by the
 * instructing party. The message can be used to report one of the following:<br>
 * - the cancellation is accepted for further processing, or<br>
 * - the cancellation is rejected, or<br>
 * - the order has been cancelled.<br>
 * When the cancellation is rejected, the reason for the rejection must be
 * specified.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesTradeArchive
 * SecuritiesTradeArchive}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlName
 * xmlName} = "setr.017.001.02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "setr.017.001.02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV02#mmRelatedReferenceOrOtherReferenceRule
 * OrderCancellationStatusReportV02.mmRelatedReferenceOrOtherReferenceRule}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV02#mmRelatedReference
 * OrderCancellationStatusReportV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV02#mmOtherReference
 * OrderCancellationStatusReportV02.mmOtherReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV02#mmCancellationStatusReport
 * OrderCancellationStatusReportV02.mmCancellationStatusReport}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code setr.017.001.02}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OrderCancellationStatusReportV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe OrderCancellationStatusReport is sent by an executing party, eg, a transfer agent, to the instructing party, eg, an investment manager or its authorised representative. There may be one or more intermediary parties between the executing party and the instructing party. The intermediary party is, for example, an intermediary or a concentrator.\r\nThe message gives the status of an order cancellation instruction message that was previously sent by the instructing party.\r\nUsage\r\nThe OrderCancellationStatusReport message is used to report the status of an order cancellation instruction message that was previously sent by the instructing party. The message can be used to report one of the following:\r\n- the cancellation is accepted for further processing, or\r\n- the cancellation is rejected, or\r\n- the order has been cancelled.\r\nWhen the cancellation is rejected, the reason for the rejection must be specified."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV03
 * OrderCancellationStatusReportV03}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "setr.017.001.02", propOrder = {"relatedReference", "otherReference", "cancellationStatusReport"})
public class OrderCancellationStatusReportV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * If OtherReference is not present, then RelatedReference is mandatory. If
	 * OtherReference is present, then RelatedReference is not allowed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageDefinition
	 * messageDefinition} =
	 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV02
	 * OrderCancellationStatusReportV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMXor#getImpactedMessageBuildingBlocks
	 * impactedMessageBuildingBlocks} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV02#mmRelatedReference
	 * OrderCancellationStatusReportV02.mmRelatedReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV02#mmOtherReference
	 * OrderCancellationStatusReportV02.mmOtherReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReferenceOrOtherReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OtherReference is not present, then RelatedReference is mandatory. If OtherReference is present, then RelatedReference is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMXor mmRelatedReferenceOrOtherReferenceRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReferenceOrOtherReferenceRule";
			definition = "If OtherReference is not present, then RelatedReference is mandatory. If OtherReference is present, then RelatedReference is not allowed.";
			messageDefinition_lazy = () -> com.tools20022.repository.area.setr.OrderCancellationStatusReportV02.mmObject();
			impactedMessageBuildingBlocks_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.OrderCancellationStatusReportV02.mmRelatedReference,
					com.tools20022.repository.area.setr.OrderCancellationStatusReportV02.mmOtherReference);
		}
	};
	protected List<AdditionalReference3> relatedReference;
	/**
	 * Reference to a linked message that was previously received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
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
			maxOccurs = 2;
			minOccurs = 1;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return OrderCancellationStatusReportV02.class.getMethod("getRelatedReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<AdditionalReference3> otherReference;
	/**
	 * Reference to a linked message sent in a proprietary way or reference of a
	 * system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to a linked message sent in a proprietary way or reference of a system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOtherReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "OthrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReference";
			definition = "Reference to a linked message sent in a proprietary way or reference of a system.";
			maxOccurs = 2;
			minOccurs = 1;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return OrderCancellationStatusReportV02.class.getMethod("getOtherReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected OrderStatusAndReason4 cancellationStatusReport;
	/**
	 * Status report details of a bulk or multiple or switch order cancellation
	 * instruction that was previously received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason4
	 * OrderStatusAndReason4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlStsRpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationStatusReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status report details of a bulk or multiple or switch order cancellation instruction that was previously received."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCancellationStatusReport = new MMMessageBuildingBlock() {
		{
			xmlTag = "CxlStsRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationStatusReport";
			definition = "Status report details of a bulk or multiple or switch order cancellation instruction that was previously received.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> OrderStatusAndReason4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return OrderCancellationStatusReportV02.class.getMethod("getCancellationStatusReport", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OrderCancellationStatusReportV02";
				definition = "Scope\r\nThe OrderCancellationStatusReport is sent by an executing party, eg, a transfer agent, to the instructing party, eg, an investment manager or its authorised representative. There may be one or more intermediary parties between the executing party and the instructing party. The intermediary party is, for example, an intermediary or a concentrator.\r\nThe message gives the status of an order cancellation instruction message that was previously sent by the instructing party.\r\nUsage\r\nThe OrderCancellationStatusReport message is used to report the status of an order cancellation instruction message that was previously sent by the instructing party. The message can be used to report one of the following:\r\n- the cancellation is accepted for further processing, or\r\n- the cancellation is rejected, or\r\n- the order has been cancelled.\r\nWhen the cancellation is rejected, the reason for the rejection must be specified.";
				nextVersions_lazy = () -> Arrays.asList(OrderCancellationStatusReportV03.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.OrderCancellationStatusReportV02.mmRelatedReferenceOrOtherReferenceRule);
				rootElement = "Document";
				xmlTag = "setr.017.001.02";
				businessArea_lazy = () -> SecuritiesTradeArchive.mmObject();
				xmlName = "setr.017.001.02";
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.OrderCancellationStatusReportV02.mmRelatedReference, com.tools20022.repository.area.setr.OrderCancellationStatusReportV02.mmOtherReference,
						com.tools20022.repository.area.setr.OrderCancellationStatusReportV02.mmCancellationStatusReport);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "setr";
						messageFunctionality = "017";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return OrderCancellationStatusReportV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "RltdRef", required = true)
	public List<AdditionalReference3> getRelatedReference() {
		return relatedReference;
	}

	public void setRelatedReference(List<AdditionalReference3> relatedReference) {
		this.relatedReference = relatedReference;
	}

	@XmlElement(name = "OthrRef", required = true)
	public List<AdditionalReference3> getOtherReference() {
		return otherReference;
	}

	public void setOtherReference(List<AdditionalReference3> otherReference) {
		this.otherReference = otherReference;
	}

	@XmlElement(name = "CxlStsRpt", required = true)
	public OrderStatusAndReason4 getCancellationStatusReport() {
		return cancellationStatusReport;
	}

	public void setCancellationStatusReport(OrderStatusAndReason4 cancellationStatusReport) {
		this.cancellationStatusReport = cancellationStatusReport;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:setr.017.02.02")
	static public class Document {
		@XmlElement(name = "setr.017.001.02", required = true)
		public OrderCancellationStatusReportV02 messageBody;
	}
}