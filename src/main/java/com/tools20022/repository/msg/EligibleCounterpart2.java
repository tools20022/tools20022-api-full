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
import com.tools20022.repository.choice.EligibilityIdentification2Choice;
import com.tools20022.repository.choice.SystemPartyIdentification1Choice;
import com.tools20022.repository.codeset.EligibilityType1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Represents a party to be identified as eligible for the instructing party.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EligibleCounterpart2#mmIssuerIdentification
 * EligibleCounterpart2.mmIssuerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EligibleCounterpart2#mmEligibleCounterpartIdentification
 * EligibleCounterpart2.mmEligibleCounterpartIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EligibleCounterpart2#mmValidFrom
 * EligibleCounterpart2.mmValidFrom}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EligibleCounterpart2#mmValidTo
 * EligibleCounterpart2.mmValidTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EligibleCounterpart2#mmEligibilityType
 * EligibleCounterpart2.mmEligibilityType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EligibleCounterpart2#mmEligibilityIdentification
 * EligibleCounterpart2.mmEligibilityIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "EligibleCounterpart2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Represents a party to be identified as eligible for the instructing party."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.EligibleCounterpart1
 * EligibleCounterpart1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "EligibleCounterpart2", propOrder = {"issuerIdentification", "eligibleCounterpartIdentification", "validFrom", "validTo", "eligibilityType", "eligibilityIdentification"})
public class EligibleCounterpart2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "IssrId", required = true)
	protected SystemPartyIdentification1Choice issuerIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SystemPartyIdentification1Choice
	 * SystemPartyIdentification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EligibleCounterpart2
	 * EligibleCounterpart2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique business identifier code used to identify the party providing the eligible counterpart information."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EligibleCounterpart1#mmIssuerIdentification
	 * EligibleCounterpart1.mmIssuerIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIssuerIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EligibleCounterpart2.mmObject();
			isDerived = false;
			xmlTag = "IssrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerIdentification";
			definition = "Unique business identifier code used to identify the party providing the eligible counterpart information.";
			previousVersion_lazy = () -> EligibleCounterpart1.mmIssuerIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SystemPartyIdentification1Choice.mmObject();
		}
	};
	@XmlElement(name = "ElgblCntrptId", required = true)
	protected SystemPartyIdentification1Choice eligibleCounterpartIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SystemPartyIdentification1Choice
	 * SystemPartyIdentification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EligibleCounterpart2
	 * EligibleCounterpart2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElgblCntrptId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EligibleCounterpartIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique business identifier code used to identify the central securities depository to be defined as eligible."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EligibleCounterpart1#mmEligibleCounterpartIdentification
	 * EligibleCounterpart1.mmEligibleCounterpartIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEligibleCounterpartIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EligibleCounterpart2.mmObject();
			isDerived = false;
			xmlTag = "ElgblCntrptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EligibleCounterpartIdentification";
			definition = "Unique business identifier code used to identify the central securities depository to be defined as eligible.";
			previousVersion_lazy = () -> EligibleCounterpart1.mmEligibleCounterpartIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SystemPartyIdentification1Choice.mmObject();
		}
	};
	@XmlElement(name = "VldFr", required = true)
	protected ISODate validFrom;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EligibleCounterpart2
	 * EligibleCounterpart2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VldFr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidFrom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date from when the eligible counterpart is valid."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EligibleCounterpart1#mmValidFrom
	 * EligibleCounterpart1.mmValidFrom}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValidFrom = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EligibleCounterpart2.mmObject();
			isDerived = false;
			xmlTag = "VldFr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidFrom";
			definition = "Date from when the eligible counterpart is valid.";
			previousVersion_lazy = () -> EligibleCounterpart1.mmValidFrom;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "VldTo")
	protected ISODate validTo;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EligibleCounterpart2
	 * EligibleCounterpart2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VldTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date until when the eligible counterpart is valid."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EligibleCounterpart1#mmValidTo
	 * EligibleCounterpart1.mmValidTo}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValidTo = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EligibleCounterpart2.mmObject();
			isDerived = false;
			xmlTag = "VldTo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidTo";
			definition = "Date until when the eligible counterpart is valid.";
			previousVersion_lazy = () -> EligibleCounterpart1.mmValidTo;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "ElgbltyTp", required = true)
	protected EligibilityType1Code eligibilityType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EligibilityType1Code
	 * EligibilityType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EligibleCounterpart2
	 * EligibleCounterpart2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElgbltyTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EligibilityType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the type of eligibility."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EligibleCounterpart1#mmEligibilityType
	 * EligibleCounterpart1.mmEligibilityType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEligibilityType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EligibleCounterpart2.mmObject();
			isDerived = false;
			xmlTag = "ElgbltyTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EligibilityType";
			definition = "Defines the type of eligibility.";
			previousVersion_lazy = () -> EligibleCounterpart1.mmEligibilityType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EligibilityType1Code.mmObject();
		}
	};
	@XmlElement(name = "ElgbltyId", required = true)
	protected EligibilityIdentification2Choice eligibilityIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.EligibilityIdentification2Choice
	 * EligibilityIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EligibleCounterpart2
	 * EligibleCounterpart2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElgbltyId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EligibilityIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identification of the eligible counterpart party."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EligibleCounterpart1#mmEligibilityIdentification
	 * EligibleCounterpart1.mmEligibilityIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEligibilityIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EligibleCounterpart2.mmObject();
			isDerived = false;
			xmlTag = "ElgbltyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EligibilityIdentification";
			definition = "Unique identification of the eligible counterpart party.";
			previousVersion_lazy = () -> EligibleCounterpart1.mmEligibilityIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> EligibilityIdentification2Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EligibleCounterpart2.mmIssuerIdentification, com.tools20022.repository.msg.EligibleCounterpart2.mmEligibleCounterpartIdentification,
						com.tools20022.repository.msg.EligibleCounterpart2.mmValidFrom, com.tools20022.repository.msg.EligibleCounterpart2.mmValidTo, com.tools20022.repository.msg.EligibleCounterpart2.mmEligibilityType,
						com.tools20022.repository.msg.EligibleCounterpart2.mmEligibilityIdentification);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "EligibleCounterpart2";
				definition = "Represents a party to be identified as eligible for the instructing party.";
				previousVersion_lazy = () -> EligibleCounterpart1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public SystemPartyIdentification1Choice getIssuerIdentification() {
		return issuerIdentification;
	}

	public EligibleCounterpart2 setIssuerIdentification(SystemPartyIdentification1Choice issuerIdentification) {
		this.issuerIdentification = Objects.requireNonNull(issuerIdentification);
		return this;
	}

	public SystemPartyIdentification1Choice getEligibleCounterpartIdentification() {
		return eligibleCounterpartIdentification;
	}

	public EligibleCounterpart2 setEligibleCounterpartIdentification(SystemPartyIdentification1Choice eligibleCounterpartIdentification) {
		this.eligibleCounterpartIdentification = Objects.requireNonNull(eligibleCounterpartIdentification);
		return this;
	}

	public ISODate getValidFrom() {
		return validFrom;
	}

	public EligibleCounterpart2 setValidFrom(ISODate validFrom) {
		this.validFrom = Objects.requireNonNull(validFrom);
		return this;
	}

	public Optional<ISODate> getValidTo() {
		return validTo == null ? Optional.empty() : Optional.of(validTo);
	}

	public EligibleCounterpart2 setValidTo(ISODate validTo) {
		this.validTo = validTo;
		return this;
	}

	public EligibilityType1Code getEligibilityType() {
		return eligibilityType;
	}

	public EligibleCounterpart2 setEligibilityType(EligibilityType1Code eligibilityType) {
		this.eligibilityType = Objects.requireNonNull(eligibilityType);
		return this;
	}

	public EligibilityIdentification2Choice getEligibilityIdentification() {
		return eligibilityIdentification;
	}

	public EligibleCounterpart2 setEligibilityIdentification(EligibilityIdentification2Choice eligibilityIdentification) {
		this.eligibilityIdentification = Objects.requireNonNull(eligibilityIdentification);
		return this;
	}
}