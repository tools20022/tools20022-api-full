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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.metamodel.MMXor;
import com.tools20022.repository.entity.RiskManagementLimit;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Reports either on the risk management limit or on a business error.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitReport3#mmLimitOrBusinessErrorRule
 * LimitReport3.mmLimitOrBusinessErrorRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitReport3#mmLimitIdentification
 * LimitReport3.mmLimitIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LimitReport3#mmLimit
 * LimitReport3.mmLimit}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LimitReport3#mmBusinessError
 * LimitReport3.mmBusinessError}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.RiskManagementLimit
 * RiskManagementLimit}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LimitReport3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Reports either on the risk management limit or on a business error."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "LimitReport3", propOrder = {"limitIdentification", "limit", "businessError"})
public class LimitReport3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected LimitIdentificationDetails2 limitIdentification;
	/**
	 * Identification of the limit on which information is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.LimitIdentificationDetails2
	 * LimitIdentificationDetails2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.RiskManagementLimit
	 * RiskManagementLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitReport3 LimitReport3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LmtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the limit on which information is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLimitIdentification = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> RiskManagementLimit.mmObject();
			componentContext_lazy = () -> LimitReport3.mmObject();
			isDerived = false;
			xmlTag = "LmtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitIdentification";
			definition = "Identification of the limit on which information is requested.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.LimitIdentificationDetails2.mmObject();
		}
	};
	protected LimitDetails3 limit;
	/**
	 * Requested information on the limit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.LimitDetails3
	 * LimitDetails3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.RiskManagementLimit
	 * RiskManagementLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitReport3 LimitReport3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Lmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Limit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Requested information on the limit."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLimit = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> RiskManagementLimit.mmObject();
			componentContext_lazy = () -> LimitReport3.mmObject();
			isDerived = false;
			xmlTag = "Lmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Limit";
			definition = "Requested information on the limit.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.LimitDetails3.mmObject();
		}
	};
	protected ErrorHandling3 businessError;
	/**
	 * Reason the requested business information is not given.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ErrorHandling3
	 * ErrorHandling3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitReport3 LimitReport3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BizErr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason the requested business information is not given."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBusinessError = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> LimitReport3.mmObject();
			isDerived = false;
			xmlTag = "BizErr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessError";
			definition = "Reason the requested business information is not given.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ErrorHandling3.mmObject();
		}
	};
	/**
	 * Either Limit or BusinessError must be present, but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.LimitReport3 LimitReport3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.LimitReport3#mmLimit
	 * LimitReport3.mmLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitReport3#mmBusinessError
	 * LimitReport3.mmBusinessError}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitOrBusinessErrorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either Limit or BusinessError must be present, but not both."</li>
	 * </ul>
	 */
	public static final MMXor mmLimitOrBusinessErrorRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitOrBusinessErrorRule";
			definition = "Either Limit or BusinessError must be present, but not both.";
			messageComponent_lazy = () -> LimitReport3.mmObject();
			impactedElements_lazy = () -> Arrays.asList(LimitReport3.mmLimit, LimitReport3.mmBusinessError);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(LimitReport3.mmLimitIdentification, LimitReport3.mmLimit, LimitReport3.mmBusinessError);
				trace_lazy = () -> RiskManagementLimit.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "LimitReport3";
				definition = "Reports either on the risk management limit or on a business error.";
				xors_lazy = () -> Arrays.asList(LimitReport3.mmLimitOrBusinessErrorRule);
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "LmtId", required = true)
	public LimitIdentificationDetails2 getLimitIdentification() {
		return limitIdentification;
	}

	public void setLimitIdentification(com.tools20022.repository.msg.LimitIdentificationDetails2 limitIdentification) {
		this.limitIdentification = limitIdentification;
	}

	@XmlElement(name = "Lmt", required = true)
	public LimitDetails3 getLimit() {
		return limit;
	}

	public void setLimit(com.tools20022.repository.msg.LimitDetails3 limit) {
		this.limit = limit;
	}

	@XmlElement(name = "BizErr", required = true)
	public ErrorHandling3 getBusinessError() {
		return businessError;
	}

	public void setBusinessError(com.tools20022.repository.msg.ErrorHandling3 businessError) {
		this.businessError = businessError;
	}
}