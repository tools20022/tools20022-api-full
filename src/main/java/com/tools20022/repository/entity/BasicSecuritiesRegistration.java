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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.RegistrationCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Information related to registration of securities.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="BasicSecuritiesRegistration"
 * src="doc-files/BasicSecuritiesRegistration.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration#Security
 * BasicSecuritiesRegistration.Security}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration#RegistrationInstruction
 * BasicSecuritiesRegistration.RegistrationInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration#CertificationIdentification
 * BasicSecuritiesRegistration.CertificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration#CertificationDate
 * BasicSecuritiesRegistration.CertificationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration#SecuritiesCertificate
 * BasicSecuritiesRegistration.SecuritiesCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration#SplitPeriod
 * BasicSecuritiesRegistration.SplitPeriod}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#Registration
 * Security.Registration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedSecuritiesRegistration
 * DateTimePeriod.RelatedSecuritiesRegistration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate#BasicRegistration
 * SecuritiesCertificate.BasicRegistration}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.Registration1Choice
 * Registration1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RegistrationParameters1
 * RegistrationParameters1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Registration2Choice
 * Registration2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RegistrationParameters2
 * RegistrationParameters2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RegistrationReason1
 * RegistrationReason1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RegistrationReason2
 * RegistrationReason2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Registration7Choice
 * Registration7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RegistrationReason3
 * RegistrationReason3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Registration8Choice
 * Registration8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RegistrationReason4
 * RegistrationReason4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RegistrationParameters3
 * RegistrationParameters3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RegistrationParameters4
 * RegistrationParameters4}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Registration9Choice
 * Registration9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RegistrationReason5
 * RegistrationReason5}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Registration10Choice
 * Registration10Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RegistrationParameters5
 * RegistrationParameters5}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Registration12Choice
 * Registration12Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Registration11Choice
 * Registration11Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RegistrationReason6
 * RegistrationReason6}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BasicSecuritiesRegistration"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information related to registration of securities."</li>
 * </ul>
 */
public class BasicSecuritiesRegistration {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Security for which registration information is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#Registration
	 * Security.Registration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration
	 * BasicSecuritiesRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security for which registration information is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Security = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> BasicSecuritiesRegistration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security for which registration information is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Security.Registration;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies whether registration should occur upon receipt.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RegistrationCode
	 * RegistrationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration1Choice#Code
	 * Registration1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration1Choice#Proprietary
	 * Registration1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration2Choice#Code
	 * Registration2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration2Choice#Proprietary
	 * Registration2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration3Choice#Code
	 * Registration3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration3Choice#Proprietary
	 * Registration3Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RegistrationReason1#Code
	 * RegistrationReason1.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration4Choice#Code
	 * Registration4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration4Choice#Proprietary
	 * Registration4Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RegistrationReason2#Code
	 * RegistrationReason2.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration7Choice#Code
	 * Registration7Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration7Choice#Proprietary
	 * Registration7Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RegistrationReason3#Code
	 * RegistrationReason3.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration8Choice#Code
	 * Registration8Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration8Choice#Proprietary
	 * Registration8Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RegistrationReason4#Code
	 * RegistrationReason4.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration6Choice#Code
	 * Registration6Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration6Choice#Proprietary
	 * Registration6Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration5Choice#Code
	 * Registration5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration5Choice#Proprietary
	 * Registration5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration9Choice#Code
	 * Registration9Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration9Choice#Proprietary
	 * Registration9Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RegistrationReason5#Code
	 * RegistrationReason5.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration10Choice#Code
	 * Registration10Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration10Choice#Proprietary
	 * Registration10Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration12Choice#Code
	 * Registration12Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration12Choice#Proprietary
	 * Registration12Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration11Choice#Code
	 * Registration11Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration11Choice#Proprietary
	 * Registration11Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RegistrationReason6#Code
	 * RegistrationReason6.Code}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration
	 * BasicSecuritiesRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether registration should occur upon receipt."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RegistrationInstruction = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Registration1Choice.Code, com.tools20022.repository.choice.Registration1Choice.Proprietary, com.tools20022.repository.choice.Registration2Choice.Code,
					com.tools20022.repository.choice.Registration2Choice.Proprietary, com.tools20022.repository.choice.Registration3Choice.Code, com.tools20022.repository.choice.Registration3Choice.Proprietary,
					com.tools20022.repository.msg.RegistrationReason1.Code, com.tools20022.repository.choice.Registration4Choice.Code, com.tools20022.repository.choice.Registration4Choice.Proprietary,
					com.tools20022.repository.msg.RegistrationReason2.Code, com.tools20022.repository.choice.Registration7Choice.Code, com.tools20022.repository.choice.Registration7Choice.Proprietary,
					com.tools20022.repository.msg.RegistrationReason3.Code, com.tools20022.repository.choice.Registration8Choice.Code, com.tools20022.repository.choice.Registration8Choice.Proprietary,
					com.tools20022.repository.msg.RegistrationReason4.Code, com.tools20022.repository.choice.Registration6Choice.Code, com.tools20022.repository.choice.Registration6Choice.Proprietary,
					com.tools20022.repository.choice.Registration5Choice.Code, com.tools20022.repository.choice.Registration5Choice.Proprietary, com.tools20022.repository.choice.Registration9Choice.Code,
					com.tools20022.repository.choice.Registration9Choice.Proprietary, com.tools20022.repository.msg.RegistrationReason5.Code, com.tools20022.repository.choice.Registration10Choice.Code,
					com.tools20022.repository.choice.Registration10Choice.Proprietary, com.tools20022.repository.choice.Registration12Choice.Code, com.tools20022.repository.choice.Registration12Choice.Proprietary,
					com.tools20022.repository.choice.Registration11Choice.Code, com.tools20022.repository.choice.Registration11Choice.Proprietary, com.tools20022.repository.msg.RegistrationReason6.Code);
			elementContext_lazy = () -> BasicSecuritiesRegistration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegistrationInstruction";
			definition = "Specifies whether registration should occur upon receipt.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> RegistrationCode.mmObject();
		}
	};
	/**
	 * Identification assigned to a deposit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters1#CertificationIdentification
	 * RegistrationParameters1.CertificationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters2#CertificationIdentification
	 * RegistrationParameters2.CertificationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters3#CertificationIdentification
	 * RegistrationParameters3.CertificationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters4#CertificationIdentification
	 * RegistrationParameters4.CertificationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters5#CertificationIdentification
	 * RegistrationParameters5.CertificationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration
	 * BasicSecuritiesRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification assigned to a deposit."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CertificationIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RegistrationParameters1.CertificationIdentification, com.tools20022.repository.msg.RegistrationParameters2.CertificationIdentification,
					com.tools20022.repository.msg.RegistrationParameters3.CertificationIdentification, com.tools20022.repository.msg.RegistrationParameters4.CertificationIdentification,
					com.tools20022.repository.msg.RegistrationParameters5.CertificationIdentification);
			elementContext_lazy = () -> BasicSecuritiesRegistration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CertificationIdentification";
			definition = "Identification assigned to a deposit.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Date/time at which the certificates in the deposit were validated by the
	 * agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters1#CertificationDateTime
	 * RegistrationParameters1.CertificationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters2#CertificationDateTime
	 * RegistrationParameters2.CertificationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters3#CertificationDateTime
	 * RegistrationParameters3.CertificationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters4#CertificationDateTime
	 * RegistrationParameters4.CertificationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters5#CertificationDateTime
	 * RegistrationParameters5.CertificationDateTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration
	 * BasicSecuritiesRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the certificates in the deposit were validated by the agent."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CertificationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RegistrationParameters1.CertificationDateTime, com.tools20022.repository.msg.RegistrationParameters2.CertificationDateTime,
					com.tools20022.repository.msg.RegistrationParameters3.CertificationDateTime, com.tools20022.repository.msg.RegistrationParameters4.CertificationDateTime,
					com.tools20022.repository.msg.RegistrationParameters5.CertificationDateTime);
			elementContext_lazy = () -> BasicSecuritiesRegistration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CertificationDate";
			definition = "Date/time at which the certificates in the deposit were validated by the agent.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Unique and unambiguous identification of a certificate assigned by the
	 * issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate#BasicRegistration
	 * SecuritiesCertificate.BasicRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate
	 * SecuritiesCertificate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters3#CertificateNumber
	 * RegistrationParameters3.CertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount3#CertificateNumber
	 * QuantityAndAccount3.CertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount8#CertificateNumber
	 * QuantityAndAccount8.CertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount4#CertificateNumber
	 * QuantityAndAccount4.CertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount9#CertificateNumber
	 * QuantityAndAccount9.CertificateNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration
	 * BasicSecuritiesRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesCertificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of a certificate assigned by the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesCertificate = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RegistrationParameters3.CertificateNumber, com.tools20022.repository.msg.QuantityAndAccount3.CertificateNumber,
					com.tools20022.repository.msg.QuantityAndAccount8.CertificateNumber, com.tools20022.repository.msg.QuantityAndAccount4.CertificateNumber, com.tools20022.repository.msg.QuantityAndAccount9.CertificateNumber);
			elementContext_lazy = () -> BasicSecuritiesRegistration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesCertificate";
			definition = "Unique and unambiguous identification of a certificate assigned by the issuer.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesCertificate.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesCertificate.BasicRegistration;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Period during which a physical certificate can be split.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedSecuritiesRegistration
	 * DateTimePeriod.RelatedSecuritiesRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#SplitPeriod
	 * CorporateActionPeriod10.SplitPeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration
	 * BasicSecuritiesRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SplitPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period during which a physical certificate can be split."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SplitPeriod = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionPeriod10.SplitPeriod);
			elementContext_lazy = () -> BasicSecuritiesRegistration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SplitPeriod";
			definition = "Period during which a physical certificate can be split.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.RelatedSecuritiesRegistration;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BasicSecuritiesRegistration";
				definition = "Information related to registration of securities.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.Registration, com.tools20022.repository.entity.DateTimePeriod.RelatedSecuritiesRegistration,
						com.tools20022.repository.entity.SecuritiesCertificate.BasicRegistration);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.BasicSecuritiesRegistration.Security, com.tools20022.repository.entity.BasicSecuritiesRegistration.RegistrationInstruction,
						com.tools20022.repository.entity.BasicSecuritiesRegistration.CertificationIdentification, com.tools20022.repository.entity.BasicSecuritiesRegistration.CertificationDate,
						com.tools20022.repository.entity.BasicSecuritiesRegistration.SecuritiesCertificate, com.tools20022.repository.entity.BasicSecuritiesRegistration.SplitPeriod);
				derivationComponent_lazy = () -> Arrays.asList(Registration1Choice.mmObject(), RegistrationParameters1.mmObject(), Registration2Choice.mmObject(), RegistrationParameters2.mmObject(), RegistrationReason1.mmObject(),
						RegistrationReason2.mmObject(), Registration7Choice.mmObject(), RegistrationReason3.mmObject(), Registration8Choice.mmObject(), RegistrationReason4.mmObject(), RegistrationParameters3.mmObject(),
						RegistrationParameters4.mmObject(), Registration9Choice.mmObject(), RegistrationReason5.mmObject(), Registration10Choice.mmObject(), RegistrationParameters5.mmObject(), Registration12Choice.mmObject(),
						Registration11Choice.mmObject(), RegistrationReason6.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}