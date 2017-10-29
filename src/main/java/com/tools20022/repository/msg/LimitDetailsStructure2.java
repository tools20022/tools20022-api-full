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
import com.tools20022.metamodel.MMXor;
import com.tools20022.repository.entity.RiskManagementLimit;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;

/**
 * Limit details of one particular limit set by the member and managed by the
 * transaction administrator.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure2#SingleLimitOrAllLimitsRule
 * LimitDetailsStructure2.SingleLimitOrAllLimitsRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure2#CurrentLimitIdentification
 * LimitDetailsStructure2.CurrentLimitIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure2#DefaultLimitIdentification
 * LimitDetailsStructure2.DefaultLimitIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure2#AllCurrentLimits
 * LimitDetailsStructure2.AllCurrentLimits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure2#AllDefaultLimits
 * LimitDetailsStructure2.AllDefaultLimits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure2#NewLimitValueSet
 * LimitDetailsStructure2.NewLimitValueSet}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.RiskManagementLimit
 * RiskManagementLimit}</li>
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
 * "LimitDetailsStructure2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Limit details of one particular limit set by the member and managed by the transaction administrator."
 * </li>
 * </ul>
 */
public class LimitDetailsStructure2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure2
	 * LimitDetailsStructure2}</li>
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
	public static final MMMessageAssociationEnd CurrentLimitIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> LimitDetailsStructure2.mmObject();
			businessComponentTrace_lazy = () -> RiskManagementLimit.mmObject();
			isDerived = false;
			xmlTag = "CurLmtId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentLimitIdentification";
			definition = "Identification of the current limit.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> LimitIdentificationDetails2.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Identification of the default limit.
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
	 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure2
	 * LimitDetailsStructure2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DfltLmtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultLimitIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the default limit."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd DefaultLimitIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> LimitDetailsStructure2.mmObject();
			businessComponentTrace_lazy = () -> RiskManagementLimit.mmObject();
			isDerived = false;
			xmlTag = "DfltLmtId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultLimitIdentification";
			definition = "Identification of the default limit.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> LimitIdentificationDetails2.mmObject();
			isComposite = true;
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure2
	 * LimitDetailsStructure2}</li>
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
	public static final MMMessageAssociationEnd AllCurrentLimits = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> LimitDetailsStructure2.mmObject();
			businessComponentTrace_lazy = () -> RiskManagementLimit.mmObject();
			isDerived = false;
			xmlTag = "AllCurLmts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllCurrentLimits";
			definition = "Identification of the current limit.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> LimitIdentificationDetails3.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Identification of the default limit.
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
	 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure2
	 * LimitDetailsStructure2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AllDfltLmts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllDefaultLimits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the default limit."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd AllDefaultLimits = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> LimitDetailsStructure2.mmObject();
			businessComponentTrace_lazy = () -> RiskManagementLimit.mmObject();
			isDerived = false;
			xmlTag = "AllDfltLmts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllDefaultLimits";
			definition = "Identification of the default limit.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> LimitIdentificationDetails3.mmObject();
			isComposite = true;
		}
	};
	/**
	 * New limit values.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.LimitDetails4
	 * LimitDetails4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.RiskManagementLimit
	 * RiskManagementLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure2
	 * LimitDetailsStructure2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewLmtValSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewLimitValueSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "New limit values."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd NewLimitValueSet = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> LimitDetailsStructure2.mmObject();
			businessComponentTrace_lazy = () -> RiskManagementLimit.mmObject();
			isDerived = false;
			xmlTag = "NewLmtValSet";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewLimitValueSet";
			definition = "New limit values.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> LimitDetails4.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Each ModifyLimit message can only modify one type of limit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure2#CurrentLimitIdentification
	 * LimitDetailsStructure2.CurrentLimitIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure2#DefaultLimitIdentification
	 * LimitDetailsStructure2.DefaultLimitIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure2#AllCurrentLimits
	 * LimitDetailsStructure2.AllCurrentLimits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure2#AllDefaultLimits
	 * LimitDetailsStructure2.AllDefaultLimits}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure2
	 * LimitDetailsStructure2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleLimitOrAllLimitsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Each ModifyLimit message can only modify one type of limit."</li>
	 * </ul>
	 */
	public static final MMXor SingleLimitOrAllLimitsRule = new MMXor() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleLimitOrAllLimitsRule";
			definition = "Each ModifyLimit message can only modify one type of limit.";
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LimitDetailsStructure2.CurrentLimitIdentification, com.tools20022.repository.msg.LimitDetailsStructure2.DefaultLimitIdentification,
					com.tools20022.repository.msg.LimitDetailsStructure2.AllCurrentLimits, com.tools20022.repository.msg.LimitDetailsStructure2.AllDefaultLimits);
			messageComponent_lazy = () -> LimitDetailsStructure2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LimitDetailsStructure2.CurrentLimitIdentification, com.tools20022.repository.msg.LimitDetailsStructure2.DefaultLimitIdentification,
						com.tools20022.repository.msg.LimitDetailsStructure2.AllCurrentLimits, com.tools20022.repository.msg.LimitDetailsStructure2.AllDefaultLimits, com.tools20022.repository.msg.LimitDetailsStructure2.NewLimitValueSet);
				trace_lazy = () -> RiskManagementLimit.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "LimitDetailsStructure2";
				definition = "Limit details of one particular limit set by the member and managed by the transaction administrator.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LimitDetailsStructure2.SingleLimitOrAllLimitsRule);
			}
		});
		return mmObject_lazy.get();
	}
}