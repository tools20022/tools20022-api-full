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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMXor;
import com.tools20022.repository.choice.PartiallySettled21Choice;
import com.tools20022.repository.codeset.SettledStatusReason1Code;
import com.tools20022.repository.datatype.Extended350Code;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.entity.SecuritiesOrderStatus;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;

/**
 * Status is partially settled.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartiallySettledStatus1#ReasonOrExtendedReasonOrDSSRule
 * PartiallySettledStatus1.ReasonOrExtendedReasonOrDSSRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PartiallySettledStatus1#Reason
 * PartiallySettledStatus1.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartiallySettledStatus1#ExtendedReason
 * PartiallySettledStatus1.ExtendedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartiallySettledStatus1#DataSourceScheme
 * PartiallySettledStatus1.DataSourceScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartiallySettledStatus1#AdditionalInformation
 * PartiallySettledStatus1.AdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
 * SecuritiesOrderStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PartiallySettledStatus1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Status is partially settled."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PartiallySettledStatus10
 * PartiallySettledStatus10}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartiallySettled21Choice
 * PartiallySettled21Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class PartiallySettledStatus1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Reason for the partially settled status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettledStatusReason1Code
	 * SettledStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#PartiallySettledStatusReason
	 * SecuritiesOrderStatus.PartiallySettledStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartiallySettledStatus1
	 * PartiallySettledStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the partially settled status."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Reason = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PartiallySettledStatus1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.PartiallySettledStatusReason;
			isDerived = false;
			xmlTag = "Rsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reason";
			definition = "Reason for the partially settled status.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SettledStatusReason1Code.mmObject();
		}
	};
	/**
	 * Reason for the partially settled status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Extended350Code
	 * Extended350Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartiallySettledStatus1
	 * PartiallySettledStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndedRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the partially settled status."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute ExtendedReason = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PartiallySettledStatus1.mmObject();
			isDerived = false;
			xmlTag = "XtndedRsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedReason";
			definition = "Reason for the partially settled status.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}
	};
	/**
	 * Proprietary identification of the reason for the partially settled status
	 * in the report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.GenericIdentification1
	 * GenericIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#DataSourceScheme
	 * StatusReason.DataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartiallySettledStatus1
	 * PartiallySettledStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DataSrcSchme"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataSourceScheme"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Proprietary identification of the reason for the partially settled status in the report."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd DataSourceScheme = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PartiallySettledStatus1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.StatusReason.DataSourceScheme;
			isDerived = false;
			xmlTag = "DataSrcSchme";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSourceScheme";
			definition = "Proprietary identification of the reason for the partially settled status in the report.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> GenericIdentification1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Additional information about the partially settled status reason.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#Reason
	 * StatusReason.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartiallySettledStatus1
	 * PartiallySettledStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information about the partially settled status reason."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute AdditionalInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PartiallySettledStatus1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.StatusReason.Reason;
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information about the partially settled status reason.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * One and only one message element in the list (Reason, ExtendedReason,
	 * DataSourceScheme) must be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartiallySettledStatus1#Reason
	 * PartiallySettledStatus1.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartiallySettledStatus1#ExtendedReason
	 * PartiallySettledStatus1.ExtendedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartiallySettledStatus1#DataSourceScheme
	 * PartiallySettledStatus1.DataSourceScheme}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.PartiallySettledStatus1
	 * PartiallySettledStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReasonOrExtendedReasonOrDSSRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "One and only one message element in the list (Reason, ExtendedReason, DataSourceScheme) must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMXor ReasonOrExtendedReasonOrDSSRule = new MMXor() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReasonOrExtendedReasonOrDSSRule";
			definition = "One and only one message element in the list (Reason, ExtendedReason, DataSourceScheme) must be present.";
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PartiallySettledStatus1.Reason, com.tools20022.repository.msg.PartiallySettledStatus1.ExtendedReason,
					com.tools20022.repository.msg.PartiallySettledStatus1.DataSourceScheme);
			messageComponent_lazy = () -> PartiallySettledStatus1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PartiallySettledStatus1.Reason, com.tools20022.repository.msg.PartiallySettledStatus1.ExtendedReason,
						com.tools20022.repository.msg.PartiallySettledStatus1.DataSourceScheme, com.tools20022.repository.msg.PartiallySettledStatus1.AdditionalInformation);
				trace_lazy = () -> SecuritiesOrderStatus.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "PartiallySettledStatus1";
				definition = "Status is partially settled.";
				nextVersions_lazy = () -> Arrays.asList(PartiallySettledStatus10.mmObject(), PartiallySettled21Choice.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PartiallySettledStatus1.ReasonOrExtendedReasonOrDSSRule);
			}
		});
		return mmObject_lazy.get();
	}
}