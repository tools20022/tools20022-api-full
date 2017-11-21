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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.RatioFormat10Choice;
import com.tools20022.repository.choice.RatioFormat9Choice;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.BiddingConditions;
import com.tools20022.repository.entity.CorporateActionEvent;
import com.tools20022.repository.entity.SecuritiesProceedsDefinition;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies security rate details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate13#mmAdditionalQuantityForSubscribedResultantSecurities
 * CorporateActionRate13.mmAdditionalQuantityForSubscribedResultantSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate13#mmAdditionalQuantityForExistingSecurities
 * CorporateActionRate13.mmAdditionalQuantityForExistingSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate13#mmNewToOld
 * CorporateActionRate13.mmNewToOld}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate13#mmNewSecuritiesToUnderlyingSecurities
 * CorporateActionRate13.mmNewSecuritiesToUnderlyingSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate13#mmTransformationRate
 * CorporateActionRate13.mmTransformationRate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionEvent
 * CorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionRate13"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies security rate details."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateActionRate13", propOrder = {"additionalQuantityForSubscribedResultantSecurities", "additionalQuantityForExistingSecurities", "newToOld", "newSecuritiesToUnderlyingSecurities", "transformationRate"})
public class CorporateActionRate13 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected RatioFormat9Choice additionalQuantityForSubscribedResultantSecurities;
	/**
	 * Quantity of additional intermediate securities/new equities awarded for a
	 * given quantity of securities derived from subscription.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RatioFormat9Choice
	 * RatioFormat9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmAdditionalQuantityForSubscribedResultantSecurities
	 * SecuritiesProceedsDefinition.
	 * mmAdditionalQuantityForSubscribedResultantSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate13
	 * CorporateActionRate13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlQtyForSbcbdRsltntScties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalQuantityForSubscribedResultantSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of additional intermediate securities/new equities awarded for a given quantity of securities derived from subscription."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdditionalQuantityForSubscribedResultantSecurities = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmAdditionalQuantityForSubscribedResultantSecurities;
			componentContext_lazy = () -> CorporateActionRate13.mmObject();
			isDerived = false;
			xmlTag = "AddtlQtyForSbcbdRsltntScties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalQuantityForSubscribedResultantSecurities";
			definition = "Quantity of additional intermediate securities/new equities awarded for a given quantity of securities derived from subscription.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RatioFormat9Choice.mmObject();
		}
	};
	protected RatioFormat9Choice additionalQuantityForExistingSecurities;
	/**
	 * Quantity of additional securities for a given quantity of underlying
	 * securities where underlying securities are not exchanged or debited, for
	 * example, 1 for 1: 1 new equity credited for every 1 underlying equity = 2
	 * resulting equities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RatioFormat9Choice
	 * RatioFormat9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmAdditionalQuantityForExistingSecurities
	 * SecuritiesProceedsDefinition.mmAdditionalQuantityForExistingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate13
	 * CorporateActionRate13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlQtyForExstgScties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalQuantityForExistingSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of additional securities for a given quantity of underlying securities where underlying securities are not exchanged or debited, for example, 1 for 1: 1 new equity credited for every 1 underlying equity = 2 resulting equities."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdditionalQuantityForExistingSecurities = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmAdditionalQuantityForExistingSecurities;
			componentContext_lazy = () -> CorporateActionRate13.mmObject();
			isDerived = false;
			xmlTag = "AddtlQtyForExstgScties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalQuantityForExistingSecurities";
			definition = "Quantity of additional securities for a given quantity of underlying securities where underlying securities are not exchanged or debited, for example, 1 for 1: 1 new equity credited for every 1 underlying equity = 2 resulting equities.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RatioFormat9Choice.mmObject();
		}
	};
	protected RatioFormat10Choice newToOld;
	/**
	 * Quantity of new securities for a given quantity of underlying securities,
	 * where the underlying securities will be exchanged or debited, for
	 * example, 2 for 1: 2 new equities credited for every 1 underlying equity
	 * debited = 2 resulting equities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RatioFormat10Choice
	 * RatioFormat10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmNewToOld
	 * SecuritiesProceedsDefinition.mmNewToOld}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate13
	 * CorporateActionRate13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewToOd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewToOld"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of new securities for a given quantity of underlying securities, where the underlying securities will be exchanged or debited, for example, 2 for 1: 2 new equities credited for every 1 underlying equity debited = 2 resulting equities."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNewToOld = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmNewToOld;
			componentContext_lazy = () -> CorporateActionRate13.mmObject();
			isDerived = false;
			xmlTag = "NewToOd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewToOld";
			definition = "Quantity of new securities for a given quantity of underlying securities, where the underlying securities will be exchanged or debited, for example, 2 for 1: 2 new equities credited for every 1 underlying equity debited = 2 resulting equities.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RatioFormat10Choice.mmObject();
		}
	};
	protected RatioFormat10Choice newSecuritiesToUnderlyingSecurities;
	/**
	 * Quantity of new equities that will be derived by the exercise of a given
	 * quantity of intermediate securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RatioFormat10Choice
	 * RatioFormat10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmNewSecuritiesToUnderlyingSecurities
	 * SecuritiesProceedsDefinition.mmNewSecuritiesToUnderlyingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate13
	 * CorporateActionRate13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewSctiesToUndrlygScties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewSecuritiesToUnderlyingSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of new equities that will be derived by the exercise of a given quantity of intermediate securities."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNewSecuritiesToUnderlyingSecurities = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmNewSecuritiesToUnderlyingSecurities;
			componentContext_lazy = () -> CorporateActionRate13.mmObject();
			isDerived = false;
			xmlTag = "NewSctiesToUndrlygScties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewSecuritiesToUnderlyingSecurities";
			definition = "Quantity of new equities that will be derived by the exercise of a given quantity of intermediate securities.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RatioFormat10Choice.mmObject();
		}
	};
	protected PercentageRate transformationRate;
	/**
	 * Rate used to determine the cash consideration split across outturn
	 * settlement transactions that are the result of a transformation of the
	 * parent transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmTransformationRate
	 * BiddingConditions.mmTransformationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate13
	 * CorporateActionRate13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfrmatnRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransformationRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate used to determine the cash consideration split across outturn settlement transactions that are the result of a transformation of the parent transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransformationRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmTransformationRate;
			componentContext_lazy = () -> CorporateActionRate13.mmObject();
			isDerived = false;
			xmlTag = "TrfrmatnRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransformationRate";
			definition = "Rate used to determine the cash consideration split across outturn settlement transactions that are the result of a transformation of the parent transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionRate13.mmAdditionalQuantityForSubscribedResultantSecurities, CorporateActionRate13.mmAdditionalQuantityForExistingSecurities, CorporateActionRate13.mmNewToOld,
						CorporateActionRate13.mmNewSecuritiesToUnderlyingSecurities, CorporateActionRate13.mmTransformationRate);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionRate13";
				definition = "Specifies security rate details.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "AddtlQtyForSbcbdRsltntScties")
	public RatioFormat9Choice getAdditionalQuantityForSubscribedResultantSecurities() {
		return additionalQuantityForSubscribedResultantSecurities;
	}

	public void setAdditionalQuantityForSubscribedResultantSecurities(RatioFormat9Choice additionalQuantityForSubscribedResultantSecurities) {
		this.additionalQuantityForSubscribedResultantSecurities = additionalQuantityForSubscribedResultantSecurities;
	}

	@XmlElement(name = "AddtlQtyForExstgScties")
	public RatioFormat9Choice getAdditionalQuantityForExistingSecurities() {
		return additionalQuantityForExistingSecurities;
	}

	public void setAdditionalQuantityForExistingSecurities(RatioFormat9Choice additionalQuantityForExistingSecurities) {
		this.additionalQuantityForExistingSecurities = additionalQuantityForExistingSecurities;
	}

	@XmlElement(name = "NewToOd")
	public RatioFormat10Choice getNewToOld() {
		return newToOld;
	}

	public void setNewToOld(RatioFormat10Choice newToOld) {
		this.newToOld = newToOld;
	}

	@XmlElement(name = "NewSctiesToUndrlygScties")
	public RatioFormat10Choice getNewSecuritiesToUnderlyingSecurities() {
		return newSecuritiesToUnderlyingSecurities;
	}

	public void setNewSecuritiesToUnderlyingSecurities(RatioFormat10Choice newSecuritiesToUnderlyingSecurities) {
		this.newSecuritiesToUnderlyingSecurities = newSecuritiesToUnderlyingSecurities;
	}

	@XmlElement(name = "TrfrmatnRate")
	public PercentageRate getTransformationRate() {
		return transformationRate;
	}

	public void setTransformationRate(PercentageRate transformationRate) {
		this.transformationRate = transformationRate;
	}
}