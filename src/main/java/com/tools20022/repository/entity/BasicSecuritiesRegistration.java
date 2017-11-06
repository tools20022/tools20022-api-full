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
import java.util.List;

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
 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration#mmSecurity
 * BasicSecuritiesRegistration.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration#mmRegistrationInstruction
 * BasicSecuritiesRegistration.mmRegistrationInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration#mmCertificationIdentification
 * BasicSecuritiesRegistration.mmCertificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration#mmCertificationDate
 * BasicSecuritiesRegistration.mmCertificationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration#mmSecuritiesCertificate
 * BasicSecuritiesRegistration.mmSecuritiesCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration#mmSplitPeriod
 * BasicSecuritiesRegistration.mmSplitPeriod}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmRegistration
 * Security.mmRegistration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedSecuritiesRegistration
 * DateTimePeriod.mmRelatedSecuritiesRegistration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate#mmBasicRegistration
 * SecuritiesCertificate.mmBasicRegistration}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected Security security;
	/**
	 * Security for which registration information is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmRegistration
	 * Security.mmRegistration}</li>
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
	public static final MMBusinessAssociationEnd mmSecurity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> BasicSecuritiesRegistration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security for which registration information is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.mmRegistration;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};
	protected RegistrationCode registrationInstruction;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration
	 * BasicSecuritiesRegistration}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration1Choice#mmCode
	 * Registration1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration1Choice#mmProprietary
	 * Registration1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration2Choice#mmCode
	 * Registration2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration2Choice#mmProprietary
	 * Registration2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration3Choice#mmCode
	 * Registration3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration3Choice#mmProprietary
	 * Registration3Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RegistrationReason1#mmCode
	 * RegistrationReason1.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration4Choice#mmCode
	 * Registration4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration4Choice#mmProprietary
	 * Registration4Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RegistrationReason2#mmCode
	 * RegistrationReason2.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration7Choice#mmCode
	 * Registration7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration7Choice#mmProprietary
	 * Registration7Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RegistrationReason3#mmCode
	 * RegistrationReason3.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration8Choice#mmCode
	 * Registration8Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration8Choice#mmProprietary
	 * Registration8Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RegistrationReason4#mmCode
	 * RegistrationReason4.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration6Choice#mmCode
	 * Registration6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration6Choice#mmProprietary
	 * Registration6Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration5Choice#mmCode
	 * Registration5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration5Choice#mmProprietary
	 * Registration5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration9Choice#mmCode
	 * Registration9Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration9Choice#mmProprietary
	 * Registration9Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RegistrationReason5#mmCode
	 * RegistrationReason5.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration10Choice#mmCode
	 * Registration10Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration10Choice#mmProprietary
	 * Registration10Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration12Choice#mmCode
	 * Registration12Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration12Choice#mmProprietary
	 * Registration12Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration11Choice#mmCode
	 * Registration11Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration11Choice#mmProprietary
	 * Registration11Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RegistrationReason6#mmCode
	 * RegistrationReason6.mmCode}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmRegistrationInstruction = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Registration1Choice.mmCode, com.tools20022.repository.choice.Registration1Choice.mmProprietary, com.tools20022.repository.choice.Registration2Choice.mmCode,
					com.tools20022.repository.choice.Registration2Choice.mmProprietary, com.tools20022.repository.choice.Registration3Choice.mmCode, com.tools20022.repository.choice.Registration3Choice.mmProprietary,
					com.tools20022.repository.msg.RegistrationReason1.mmCode, com.tools20022.repository.choice.Registration4Choice.mmCode, com.tools20022.repository.choice.Registration4Choice.mmProprietary,
					com.tools20022.repository.msg.RegistrationReason2.mmCode, com.tools20022.repository.choice.Registration7Choice.mmCode, com.tools20022.repository.choice.Registration7Choice.mmProprietary,
					com.tools20022.repository.msg.RegistrationReason3.mmCode, com.tools20022.repository.choice.Registration8Choice.mmCode, com.tools20022.repository.choice.Registration8Choice.mmProprietary,
					com.tools20022.repository.msg.RegistrationReason4.mmCode, com.tools20022.repository.choice.Registration6Choice.mmCode, com.tools20022.repository.choice.Registration6Choice.mmProprietary,
					com.tools20022.repository.choice.Registration5Choice.mmCode, com.tools20022.repository.choice.Registration5Choice.mmProprietary, com.tools20022.repository.choice.Registration9Choice.mmCode,
					com.tools20022.repository.choice.Registration9Choice.mmProprietary, com.tools20022.repository.msg.RegistrationReason5.mmCode, com.tools20022.repository.choice.Registration10Choice.mmCode,
					com.tools20022.repository.choice.Registration10Choice.mmProprietary, com.tools20022.repository.choice.Registration12Choice.mmCode, com.tools20022.repository.choice.Registration12Choice.mmProprietary,
					com.tools20022.repository.choice.Registration11Choice.mmCode, com.tools20022.repository.choice.Registration11Choice.mmProprietary, com.tools20022.repository.msg.RegistrationReason6.mmCode);
			elementContext_lazy = () -> BasicSecuritiesRegistration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegistrationInstruction";
			definition = "Specifies whether registration should occur upon receipt.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RegistrationCode.mmObject();
		}
	};
	protected Max35Text certificationIdentification;
	/**
	 * Identification assigned to a deposit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration
	 * BasicSecuritiesRegistration}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters1#mmCertificationIdentification
	 * RegistrationParameters1.mmCertificationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters2#mmCertificationIdentification
	 * RegistrationParameters2.mmCertificationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters3#mmCertificationIdentification
	 * RegistrationParameters3.mmCertificationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters4#mmCertificationIdentification
	 * RegistrationParameters4.mmCertificationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters5#mmCertificationIdentification
	 * RegistrationParameters5.mmCertificationIdentification}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmCertificationIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RegistrationParameters1.mmCertificationIdentification, com.tools20022.repository.msg.RegistrationParameters2.mmCertificationIdentification,
					com.tools20022.repository.msg.RegistrationParameters3.mmCertificationIdentification, com.tools20022.repository.msg.RegistrationParameters4.mmCertificationIdentification,
					com.tools20022.repository.msg.RegistrationParameters5.mmCertificationIdentification);
			elementContext_lazy = () -> BasicSecuritiesRegistration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CertificationIdentification";
			definition = "Identification assigned to a deposit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ISODateTime certificationDate;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration
	 * BasicSecuritiesRegistration}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters1#mmCertificationDateTime
	 * RegistrationParameters1.mmCertificationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters2#mmCertificationDateTime
	 * RegistrationParameters2.mmCertificationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters3#mmCertificationDateTime
	 * RegistrationParameters3.mmCertificationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters4#mmCertificationDateTime
	 * RegistrationParameters4.mmCertificationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters5#mmCertificationDateTime
	 * RegistrationParameters5.mmCertificationDateTime}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmCertificationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RegistrationParameters1.mmCertificationDateTime, com.tools20022.repository.msg.RegistrationParameters2.mmCertificationDateTime,
					com.tools20022.repository.msg.RegistrationParameters3.mmCertificationDateTime, com.tools20022.repository.msg.RegistrationParameters4.mmCertificationDateTime,
					com.tools20022.repository.msg.RegistrationParameters5.mmCertificationDateTime);
			elementContext_lazy = () -> BasicSecuritiesRegistration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CertificationDate";
			definition = "Date/time at which the certificates in the deposit were validated by the agent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesCertificate> securitiesCertificate;
	/**
	 * Unique and unambiguous identification of a certificate assigned by the
	 * issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate#mmBasicRegistration
	 * SecuritiesCertificate.mmBasicRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate
	 * SecuritiesCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration
	 * BasicSecuritiesRegistration}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters3#mmCertificateNumber
	 * RegistrationParameters3.mmCertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount3#mmCertificateNumber
	 * QuantityAndAccount3.mmCertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount8#mmCertificateNumber
	 * QuantityAndAccount8.mmCertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount4#mmCertificateNumber
	 * QuantityAndAccount4.mmCertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount9#mmCertificateNumber
	 * QuantityAndAccount9.mmCertificateNumber}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesCertificate = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RegistrationParameters3.mmCertificateNumber, com.tools20022.repository.msg.QuantityAndAccount3.mmCertificateNumber,
					com.tools20022.repository.msg.QuantityAndAccount8.mmCertificateNumber, com.tools20022.repository.msg.QuantityAndAccount4.mmCertificateNumber, com.tools20022.repository.msg.QuantityAndAccount9.mmCertificateNumber);
			elementContext_lazy = () -> BasicSecuritiesRegistration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesCertificate";
			definition = "Unique and unambiguous identification of a certificate assigned by the issuer.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesCertificate.mmBasicRegistration;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesCertificate.mmObject();
		}
	};
	protected DateTimePeriod splitPeriod;
	/**
	 * Period during which a physical certificate can be split.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedSecuritiesRegistration
	 * DateTimePeriod.mmRelatedSecuritiesRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration
	 * BasicSecuritiesRegistration}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmSplitPeriod
	 * CorporateActionPeriod10.mmSplitPeriod}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmSplitPeriod = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionPeriod10.mmSplitPeriod);
			elementContext_lazy = () -> BasicSecuritiesRegistration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SplitPeriod";
			definition = "Period during which a physical certificate can be split.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmRelatedSecuritiesRegistration;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BasicSecuritiesRegistration";
				definition = "Information related to registration of securities.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmRegistration, com.tools20022.repository.entity.DateTimePeriod.mmRelatedSecuritiesRegistration,
						com.tools20022.repository.entity.SecuritiesCertificate.mmBasicRegistration);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.BasicSecuritiesRegistration.mmSecurity, com.tools20022.repository.entity.BasicSecuritiesRegistration.mmRegistrationInstruction,
						com.tools20022.repository.entity.BasicSecuritiesRegistration.mmCertificationIdentification, com.tools20022.repository.entity.BasicSecuritiesRegistration.mmCertificationDate,
						com.tools20022.repository.entity.BasicSecuritiesRegistration.mmSecuritiesCertificate, com.tools20022.repository.entity.BasicSecuritiesRegistration.mmSplitPeriod);
				derivationComponent_lazy = () -> Arrays.asList(Registration1Choice.mmObject(), RegistrationParameters1.mmObject(), Registration2Choice.mmObject(), RegistrationParameters2.mmObject(), RegistrationReason1.mmObject(),
						RegistrationReason2.mmObject(), Registration7Choice.mmObject(), RegistrationReason3.mmObject(), Registration8Choice.mmObject(), RegistrationReason4.mmObject(), RegistrationParameters3.mmObject(),
						RegistrationParameters4.mmObject(), Registration9Choice.mmObject(), RegistrationReason5.mmObject(), Registration10Choice.mmObject(), RegistrationParameters5.mmObject(), Registration12Choice.mmObject(),
						Registration11Choice.mmObject(), RegistrationReason6.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Security getSecurity() {
		return security;
	}

	public void setSecurity(com.tools20022.repository.entity.Security security) {
		this.security = security;
	}

	public RegistrationCode getRegistrationInstruction() {
		return registrationInstruction;
	}

	public void setRegistrationInstruction(RegistrationCode registrationInstruction) {
		this.registrationInstruction = registrationInstruction;
	}

	public Max35Text getCertificationIdentification() {
		return certificationIdentification;
	}

	public void setCertificationIdentification(Max35Text certificationIdentification) {
		this.certificationIdentification = certificationIdentification;
	}

	public ISODateTime getCertificationDate() {
		return certificationDate;
	}

	public void setCertificationDate(ISODateTime certificationDate) {
		this.certificationDate = certificationDate;
	}

	public List<SecuritiesCertificate> getSecuritiesCertificate() {
		return securitiesCertificate;
	}

	public void setSecuritiesCertificate(List<com.tools20022.repository.entity.SecuritiesCertificate> securitiesCertificate) {
		this.securitiesCertificate = securitiesCertificate;
	}

	public DateTimePeriod getSplitPeriod() {
		return splitPeriod;
	}

	public void setSplitPeriod(com.tools20022.repository.entity.DateTimePeriod splitPeriod) {
		this.splitPeriod = splitPeriod;
	}
}