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

import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.CancelledStatusReason2Code;
import com.tools20022.repository.codeset.NoReasonCode;
import com.tools20022.repository.datatype.Extended350Code;
import com.tools20022.repository.entity.SecuritiesTradeStatusReason;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Status is cancelled.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CancelledStatus2#ReasonRule
 * CancelledStatus2.ReasonRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CancelledStatus2#mmReason
 * CancelledStatus2.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CancelledStatus2#mmExtendedReason
 * CancelledStatus2.mmExtendedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CancelledStatus2#mmDataSourceScheme
 * CancelledStatus2.mmDataSourceScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CancelledStatus2#mmNoSpecifiedReason
 * CancelledStatus2.mmNoSpecifiedReason}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
 * SecuritiesTradeStatusReason}</li>
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
 * "CancelledStatus2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Status is cancelled."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CancelledStatusReason16
 * CancelledStatusReason16}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CancelledStatus2", propOrder = {"reason", "extendedReason", "dataSourceScheme", "noSpecifiedReason"})
public class CancelledStatus2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Rsn", required = true)
	protected CancelledStatusReason2Code reason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason2Code
	 * CancelledStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmCancellationReason
	 * StatusReason.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CancelledStatus2
	 * CancelledStatus2}</li>
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
	 * definition} = "Reason for the cancelled status."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReason = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmCancellationReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.CancelledStatus2.mmObject();
			isDerived = false;
			xmlTag = "Rsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reason";
			definition = "Reason for the cancelled status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CancelledStatusReason2Code.mmObject();
		}
	};
	@XmlElement(name = "XtndedRsn", required = true)
	protected Extended350Code extendedReason;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CancelledStatus2
	 * CancelledStatus2}</li>
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
	 * definition} = "Reason for the cancelled status."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExtendedReason = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CancelledStatus2.mmObject();
			isDerived = false;
			xmlTag = "XtndedRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedReason";
			definition = "Reason for the cancelled status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}
	};
	@XmlElement(name = "DataSrcSchme", required = true)
	protected GenericIdentification1 dataSourceScheme;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.GenericIdentification1
	 * GenericIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmDataSourceScheme
	 * StatusReason.mmDataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CancelledStatus2
	 * CancelledStatus2}</li>
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
	 * "Proprietary identification of the reason for the cancelled status."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDataSourceScheme = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmDataSourceScheme;
			componentContext_lazy = () -> com.tools20022.repository.msg.CancelledStatus2.mmObject();
			isDerived = false;
			xmlTag = "DataSrcSchme";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSourceScheme";
			definition = "Proprietary identification of the reason for the cancelled status.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification1.mmObject();
		}
	};
	@XmlElement(name = "NoSpcfdRsn", required = true)
	protected NoReasonCode noSpecifiedReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.NoReasonCode
	 * NoReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmNoSpecifiedReason
	 * StatusReason.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CancelledStatus2
	 * CancelledStatus2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NoSpcfdRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoSpecifiedReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that there is no reason available or to report."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNoSpecifiedReason = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmNoSpecifiedReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.CancelledStatus2.mmObject();
			isDerived = false;
			xmlTag = "NoSpcfdRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoSpecifiedReason";
			definition = "Indicates that there is no reason available or to report.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NoReasonCode.mmObject();
		}
	};
	/**
	 * One and only one message element in the list (Reason, ExtendedReason,
	 * DataSourceScheme, NoSpecifiedReason) must be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.CancelledStatus2
	 * CancelledStatus2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CancelledStatus2#mmReason
	 * CancelledStatus2.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatus2#mmExtendedReason
	 * CancelledStatus2.mmExtendedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatus2#mmDataSourceScheme
	 * CancelledStatus2.mmDataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatus2#mmNoSpecifiedReason
	 * CancelledStatus2.mmNoSpecifiedReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "One and only one message element in the list (Reason, ExtendedReason, DataSourceScheme, NoSpecifiedReason) must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMXor ReasonRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReasonRule";
			definition = "One and only one message element in the list (Reason, ExtendedReason, DataSourceScheme, NoSpecifiedReason) must be present.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.CancelledStatus2.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CancelledStatus2.mmReason, com.tools20022.repository.msg.CancelledStatus2.mmExtendedReason,
					com.tools20022.repository.msg.CancelledStatus2.mmDataSourceScheme, com.tools20022.repository.msg.CancelledStatus2.mmNoSpecifiedReason);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CancelledStatus2.mmReason, com.tools20022.repository.msg.CancelledStatus2.mmExtendedReason,
						com.tools20022.repository.msg.CancelledStatus2.mmDataSourceScheme, com.tools20022.repository.msg.CancelledStatus2.mmNoSpecifiedReason);
				trace_lazy = () -> SecuritiesTradeStatusReason.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "CancelledStatus2";
				definition = "Status is cancelled.";
				nextVersions_lazy = () -> Arrays.asList(CancelledStatusReason16.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CancelledStatus2.ReasonRule);
			}
		});
		return mmObject_lazy.get();
	}

	public CancelledStatusReason2Code getReason() {
		return reason;
	}

	public CancelledStatus2 setReason(CancelledStatusReason2Code reason) {
		this.reason = Objects.requireNonNull(reason);
		return this;
	}

	public Extended350Code getExtendedReason() {
		return extendedReason;
	}

	public CancelledStatus2 setExtendedReason(Extended350Code extendedReason) {
		this.extendedReason = Objects.requireNonNull(extendedReason);
		return this;
	}

	public GenericIdentification1 getDataSourceScheme() {
		return dataSourceScheme;
	}

	public CancelledStatus2 setDataSourceScheme(com.tools20022.repository.msg.GenericIdentification1 dataSourceScheme) {
		this.dataSourceScheme = Objects.requireNonNull(dataSourceScheme);
		return this;
	}

	public NoReasonCode getNoSpecifiedReason() {
		return noSpecifiedReason;
	}

	public CancelledStatus2 setNoSpecifiedReason(NoReasonCode noSpecifiedReason) {
		this.noSpecifiedReason = Objects.requireNonNull(noSpecifiedReason);
		return this;
	}
}