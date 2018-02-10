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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.RatioFormat5Choice;
import com.tools20022.repository.choice.RatioFormat6Choice;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.BiddingConditions;
import com.tools20022.repository.entity.CorporateActionEvent;
import com.tools20022.repository.entity.SecuritiesProceedsDefinition;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
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
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate7#mmAdditionalQuantityForSubscribedResultantSecurities
 * CorporateActionRate7.mmAdditionalQuantityForSubscribedResultantSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate7#mmAdditionalQuantityForExistingSecurities
 * CorporateActionRate7.mmAdditionalQuantityForExistingSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate7#mmNewToOld
 * CorporateActionRate7.mmNewToOld}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate7#mmNewSecuritiesToUnderlyingSecurities
 * CorporateActionRate7.mmNewSecuritiesToUnderlyingSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate7#mmTransformationRate
 * CorporateActionRate7.mmTransformationRate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionEvent
 * CorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionRate7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies security rate details."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionRate7", propOrder = {"additionalQuantityForSubscribedResultantSecurities", "additionalQuantityForExistingSecurities", "newToOld", "newSecuritiesToUnderlyingSecurities", "transformationRate"})
public class CorporateActionRate7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AddtlQtyForSbcbdRsltntScties")
	protected RatioFormat5Choice additionalQuantityForSubscribedResultantSecurities;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RatioFormat5Choice
	 * RatioFormat5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmAdditionalQuantityForSubscribedResultantSecurities
	 * SecuritiesProceedsDefinition.
	 * mmAdditionalQuantityForSubscribedResultantSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate7
	 * CorporateActionRate7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlQtyForSbcbdRsltntScties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::ADSR</li>
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
	public static final MMMessageAttribute mmAdditionalQuantityForSubscribedResultantSecurities = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmAdditionalQuantityForSubscribedResultantSecurities;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate7.mmObject();
			isDerived = false;
			xmlTag = "AddtlQtyForSbcbdRsltntScties";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::ADSR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalQuantityForSubscribedResultantSecurities";
			definition = "Quantity of additional intermediate securities/new equities awarded for a given quantity of securities derived from subscription.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RatioFormat5Choice.mmObject();
		}
	};
	@XmlElement(name = "AddtlQtyForExstgScties")
	protected RatioFormat5Choice additionalQuantityForExistingSecurities;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RatioFormat5Choice
	 * RatioFormat5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmAdditionalQuantityForExistingSecurities
	 * SecuritiesProceedsDefinition.mmAdditionalQuantityForExistingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate7
	 * CorporateActionRate7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlQtyForExstgScties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::ADEX</li>
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
	public static final MMMessageAttribute mmAdditionalQuantityForExistingSecurities = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmAdditionalQuantityForExistingSecurities;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate7.mmObject();
			isDerived = false;
			xmlTag = "AddtlQtyForExstgScties";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::ADEX"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalQuantityForExistingSecurities";
			definition = "Quantity of additional securities for a given quantity of underlying securities where underlying securities are not exchanged or debited, for example, 1 for 1: 1 new equity credited for every 1 underlying equity = 2 resulting equities.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RatioFormat5Choice.mmObject();
		}
	};
	@XmlElement(name = "NewToOd")
	protected RatioFormat6Choice newToOld;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RatioFormat6Choice
	 * RatioFormat6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmNewToOld
	 * SecuritiesProceedsDefinition.mmNewToOld}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate7
	 * CorporateActionRate7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewToOd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::NEWO</li>
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
	public static final MMMessageAttribute mmNewToOld = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmNewToOld;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate7.mmObject();
			isDerived = false;
			xmlTag = "NewToOd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::NEWO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewToOld";
			definition = "Quantity of new securities for a given quantity of underlying securities, where the underlying securities will be exchanged or debited, for example, 2 for 1: 2 new equities credited for every 1 underlying equity debited = 2 resulting equities.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RatioFormat6Choice.mmObject();
		}
	};
	@XmlElement(name = "NewSctiesToUndrlygScties")
	protected RatioFormat6Choice newSecuritiesToUnderlyingSecurities;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RatioFormat6Choice
	 * RatioFormat6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmNewSecuritiesToUnderlyingSecurities
	 * SecuritiesProceedsDefinition.mmNewSecuritiesToUnderlyingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate7
	 * CorporateActionRate7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewSctiesToUndrlygScties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::NWRT</li>
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
	public static final MMMessageAttribute mmNewSecuritiesToUnderlyingSecurities = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmNewSecuritiesToUnderlyingSecurities;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate7.mmObject();
			isDerived = false;
			xmlTag = "NewSctiesToUndrlygScties";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::NWRT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewSecuritiesToUnderlyingSecurities";
			definition = "Quantity of new equities that will be derived by the exercise of a given quantity of intermediate securities.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RatioFormat6Choice.mmObject();
		}
	};
	@XmlElement(name = "TrfrmatnRate")
	protected PercentageRate transformationRate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate7
	 * CorporateActionRate7}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate7.mmObject();
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
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionRate7.mmAdditionalQuantityForSubscribedResultantSecurities,
						com.tools20022.repository.msg.CorporateActionRate7.mmAdditionalQuantityForExistingSecurities, com.tools20022.repository.msg.CorporateActionRate7.mmNewToOld,
						com.tools20022.repository.msg.CorporateActionRate7.mmNewSecuritiesToUnderlyingSecurities, com.tools20022.repository.msg.CorporateActionRate7.mmTransformationRate);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionRate7";
				definition = "Specifies security rate details.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<RatioFormat5Choice> getAdditionalQuantityForSubscribedResultantSecurities() {
		return additionalQuantityForSubscribedResultantSecurities == null ? Optional.empty() : Optional.of(additionalQuantityForSubscribedResultantSecurities);
	}

	public CorporateActionRate7 setAdditionalQuantityForSubscribedResultantSecurities(RatioFormat5Choice additionalQuantityForSubscribedResultantSecurities) {
		this.additionalQuantityForSubscribedResultantSecurities = additionalQuantityForSubscribedResultantSecurities;
		return this;
	}

	public Optional<RatioFormat5Choice> getAdditionalQuantityForExistingSecurities() {
		return additionalQuantityForExistingSecurities == null ? Optional.empty() : Optional.of(additionalQuantityForExistingSecurities);
	}

	public CorporateActionRate7 setAdditionalQuantityForExistingSecurities(RatioFormat5Choice additionalQuantityForExistingSecurities) {
		this.additionalQuantityForExistingSecurities = additionalQuantityForExistingSecurities;
		return this;
	}

	public Optional<RatioFormat6Choice> getNewToOld() {
		return newToOld == null ? Optional.empty() : Optional.of(newToOld);
	}

	public CorporateActionRate7 setNewToOld(RatioFormat6Choice newToOld) {
		this.newToOld = newToOld;
		return this;
	}

	public Optional<RatioFormat6Choice> getNewSecuritiesToUnderlyingSecurities() {
		return newSecuritiesToUnderlyingSecurities == null ? Optional.empty() : Optional.of(newSecuritiesToUnderlyingSecurities);
	}

	public CorporateActionRate7 setNewSecuritiesToUnderlyingSecurities(RatioFormat6Choice newSecuritiesToUnderlyingSecurities) {
		this.newSecuritiesToUnderlyingSecurities = newSecuritiesToUnderlyingSecurities;
		return this;
	}

	public Optional<PercentageRate> getTransformationRate() {
		return transformationRate == null ? Optional.empty() : Optional.of(transformationRate);
	}

	public CorporateActionRate7 setTransformationRate(PercentageRate transformationRate) {
		this.transformationRate = transformationRate;
		return this;
	}
}