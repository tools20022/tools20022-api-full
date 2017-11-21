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
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Limit details of one particular limit set by the member and managed by the
 * transaction administrator.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure3#mmSingleOrAllLimitsRule
 * LimitDetailsStructure3.mmSingleOrAllLimitsRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure3#mmCurrentLimitIdentification
 * LimitDetailsStructure3.mmCurrentLimitIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure3#mmAllCurrentLimits
 * LimitDetailsStructure3.mmAllCurrentLimits}</li>
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
 * "LimitDetailsStructure3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Limit details of one particular limit set by the member and managed by the transaction administrator."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "LimitDetailsStructure3", propOrder = {"currentLimitIdentification", "allCurrentLimits"})
public class LimitDetailsStructure3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.msg.LimitIdentificationDetails2> currentLimitIdentification;
	/**
	 * Identification of the current limit.
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
	 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure3
	 * LimitDetailsStructure3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CurLmtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentLimitIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the current limit."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCurrentLimitIdentification = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> RiskManagementLimit.mmObject();
			componentContext_lazy = () -> LimitDetailsStructure3.mmObject();
			isDerived = false;
			xmlTag = "CurLmtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentLimitIdentification";
			definition = "Identification of the current limit.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.LimitIdentificationDetails2.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.LimitIdentificationDetails3> allCurrentLimits;
	/**
	 * Identification of the current limit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.LimitIdentificationDetails3
	 * LimitIdentificationDetails3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.RiskManagementLimit
	 * RiskManagementLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure3
	 * LimitDetailsStructure3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AllCurLmts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllCurrentLimits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the current limit."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAllCurrentLimits = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> RiskManagementLimit.mmObject();
			componentContext_lazy = () -> LimitDetailsStructure3.mmObject();
			isDerived = false;
			xmlTag = "AllCurLmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllCurrentLimits";
			definition = "Identification of the current limit.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.LimitIdentificationDetails3.mmObject();
		}
	};
	/**
	 * Each ModifyLimit message can only modify one type of limit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure3
	 * LimitDetailsStructure3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure3#mmCurrentLimitIdentification
	 * LimitDetailsStructure3.mmCurrentLimitIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure3#mmAllCurrentLimits
	 * LimitDetailsStructure3.mmAllCurrentLimits}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleOrAllLimitsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Each ModifyLimit message can only modify one type of limit."</li>
	 * </ul>
	 */
	public static final MMXor mmSingleOrAllLimitsRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleOrAllLimitsRule";
			definition = "Each ModifyLimit message can only modify one type of limit.";
			messageComponent_lazy = () -> LimitDetailsStructure3.mmObject();
			impactedElements_lazy = () -> Arrays.asList(LimitDetailsStructure3.mmCurrentLimitIdentification, LimitDetailsStructure3.mmAllCurrentLimits);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(LimitDetailsStructure3.mmCurrentLimitIdentification, LimitDetailsStructure3.mmAllCurrentLimits);
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
				name = "LimitDetailsStructure3";
				definition = "Limit details of one particular limit set by the member and managed by the transaction administrator.";
				xors_lazy = () -> Arrays.asList(LimitDetailsStructure3.mmSingleOrAllLimitsRule);
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "CurLmtId", required = true)
	public List<LimitIdentificationDetails2> getCurrentLimitIdentification() {
		return currentLimitIdentification;
	}

	public void setCurrentLimitIdentification(List<com.tools20022.repository.msg.LimitIdentificationDetails2> currentLimitIdentification) {
		this.currentLimitIdentification = currentLimitIdentification;
	}

	@XmlElement(name = "AllCurLmts", required = true)
	public List<LimitIdentificationDetails3> getAllCurrentLimits() {
		return allCurrentLimits;
	}

	public void setAllCurrentLimits(List<com.tools20022.repository.msg.LimitIdentificationDetails3> allCurrentLimits) {
		this.allCurrentLimits = allCurrentLimits;
	}
}