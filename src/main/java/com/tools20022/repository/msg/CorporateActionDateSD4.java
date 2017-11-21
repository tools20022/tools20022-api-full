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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides additional information regarding corporate action date details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD4#mmPlaceAndName
 * CorporateActionDateSD4.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD4#mmInterimAccountingStartDate
 * CorporateActionDateSD4.mmInterimAccountingStartDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD4#mmDelistingDate
 * CorporateActionDateSD4.mmDelistingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD4#mmExercisePeriodBeginDate
 * CorporateActionDateSD4.mmExercisePeriodBeginDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD4#mmObjectionDate
 * CorporateActionDateSD4.mmObjectionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD4#mmExclusionDate
 * CorporateActionDateSD4.mmExclusionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD4#mmProofOfClaimFilingDate
 * CorporateActionDateSD4.mmProofOfClaimFilingDate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionDateSD4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action date details."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateActionDateSD4", propOrder = {"placeAndName", "interimAccountingStartDate", "delistingDate", "exercisePeriodBeginDate", "objectionDate", "exclusionDate", "proofOfClaimFilingDate"})
public class CorporateActionDateSD4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max350Text placeAndName;
	/**
	 * xPath to the element that is being extended.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD4
	 * CorporateActionDateSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "xPath to the element that is being extended."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionDateSD4.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected ISODate interimAccountingStartDate;
	/**
	 * Date on which accounting for due bills starts and associated tracking
	 * begins.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD4
	 * CorporateActionDateSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmAcctgStartDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterimAccountingStartDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which accounting for due bills starts and associated tracking begins."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterimAccountingStartDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionDateSD4.mmObject();
			isDerived = false;
			xmlTag = "IntrmAcctgStartDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterimAccountingStartDate";
			definition = "Date on which accounting for due bills starts and associated tracking begins.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate delistingDate;
	/**
	 * Date on which the event security is no longer listed on the exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD4
	 * CorporateActionDateSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlistgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DelistingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the event security is no longer listed on the exchange."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDelistingDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionDateSD4.mmObject();
			isDerived = false;
			xmlTag = "DlistgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DelistingDate";
			definition = "Date on which the event security is no longer listed on the exchange.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate exercisePeriodBeginDate;
	/**
	 * Date by which a holder can exercise warrants.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD4
	 * CorporateActionDateSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ExrcPrdBegnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExercisePeriodBeginDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date by which a holder can exercise warrants."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExercisePeriodBeginDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionDateSD4.mmObject();
			isDerived = false;
			xmlTag = "ExrcPrdBegnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExercisePeriodBeginDate";
			definition = "Date by which a holder can exercise warrants.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate objectionDate;
	/**
	 * Date by which a holder listed as a member of the claimant group in a
	 * lawsuit may object to the proposed solution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD4
	 * CorporateActionDateSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ObjctnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ObjectionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date by which a holder listed as a member of the claimant group in a lawsuit may object to the proposed solution."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmObjectionDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionDateSD4.mmObject();
			isDerived = false;
			xmlTag = "ObjctnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ObjectionDate";
			definition = "Date by which a holder listed as a member of the claimant group in a lawsuit may object to the proposed solution.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate exclusionDate;
	/**
	 * Date by which claimants may exclude themselves from an ongoing class
	 * action lawsuit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD4
	 * CorporateActionDateSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ExclsnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExclusionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date by which claimants may exclude themselves from an ongoing class action lawsuit."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExclusionDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionDateSD4.mmObject();
			isDerived = false;
			xmlTag = "ExclsnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExclusionDate";
			definition = "Date by which claimants may exclude themselves from an ongoing class action lawsuit.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate proofOfClaimFilingDate;
	/**
	 * Date by which a holder must file claim forms to become a member of the
	 * claimant group in a lawsuit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD4
	 * CorporateActionDateSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ProofOfClmFilgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProofOfClaimFilingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date by which a holder must file claim forms to become a member of the claimant group in a lawsuit."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProofOfClaimFilingDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionDateSD4.mmObject();
			isDerived = false;
			xmlTag = "ProofOfClmFilgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProofOfClaimFilingDate";
			definition = "Date by which a holder must file claim forms to become a member of the claimant group in a lawsuit.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionDateSD4.mmPlaceAndName, CorporateActionDateSD4.mmInterimAccountingStartDate, CorporateActionDateSD4.mmDelistingDate, CorporateActionDateSD4.mmExercisePeriodBeginDate,
						CorporateActionDateSD4.mmObjectionDate, CorporateActionDateSD4.mmExclusionDate, CorporateActionDateSD4.mmProofOfClaimFilingDate);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CorporateActionDateSD4";
				definition = "Provides additional information regarding corporate action date details.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PlcAndNm", required = true)
	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public void setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
	}

	@XmlElement(name = "IntrmAcctgStartDt")
	public ISODate getInterimAccountingStartDate() {
		return interimAccountingStartDate;
	}

	public void setInterimAccountingStartDate(ISODate interimAccountingStartDate) {
		this.interimAccountingStartDate = interimAccountingStartDate;
	}

	@XmlElement(name = "DlistgDt")
	public ISODate getDelistingDate() {
		return delistingDate;
	}

	public void setDelistingDate(ISODate delistingDate) {
		this.delistingDate = delistingDate;
	}

	@XmlElement(name = "ExrcPrdBegnDt")
	public ISODate getExercisePeriodBeginDate() {
		return exercisePeriodBeginDate;
	}

	public void setExercisePeriodBeginDate(ISODate exercisePeriodBeginDate) {
		this.exercisePeriodBeginDate = exercisePeriodBeginDate;
	}

	@XmlElement(name = "ObjctnDt")
	public ISODate getObjectionDate() {
		return objectionDate;
	}

	public void setObjectionDate(ISODate objectionDate) {
		this.objectionDate = objectionDate;
	}

	@XmlElement(name = "ExclsnDt")
	public ISODate getExclusionDate() {
		return exclusionDate;
	}

	public void setExclusionDate(ISODate exclusionDate) {
		this.exclusionDate = exclusionDate;
	}

	@XmlElement(name = "ProofOfClmFilgDt")
	public ISODate getProofOfClaimFilingDate() {
		return proofOfClaimFilingDate;
	}

	public void setProofOfClaimFilingDate(ISODate proofOfClaimFilingDate) {
		this.proofOfClaimFilingDate = proofOfClaimFilingDate;
	}
}