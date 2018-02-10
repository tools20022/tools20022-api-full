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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.RejectionReason46Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason why the instruction request has a rejected status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason46Code#AccountServicerDeadlineMissed
 * RejectionReason46Code.AccountServicerDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason46Code#IncorrectCertification
 * RejectionReason46Code.IncorrectCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason46Code#InvalidForTaxAuthorities
 * RejectionReason46Code.InvalidForTaxAuthorities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason46Code#InvalidOptionType
 * RejectionReason46Code.InvalidOptionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason46Code#InvalidReference
 * RejectionReason46Code.InvalidReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason46Code#InvalidSecurity
 * RejectionReason46Code.InvalidSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason46Code#LackofSecurities
 * RejectionReason46Code.LackofSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason46Code#MarketDeadlineMissed
 * RejectionReason46Code.MarketDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason46Code#Mismatch
 * RejectionReason46Code.Mismatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason46Code#MissingBeneficiaryOwnerDetails
 * RejectionReason46Code.MissingBeneficiaryOwnerDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason46Code#OptionCancelled
 * RejectionReason46Code.OptionCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason46Code#OptionInactive
 * RejectionReason46Code.OptionInactive}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason46Code#OptionNumberRejection
 * RejectionReason46Code.OptionNumberRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason46Code#Other
 * RejectionReason46Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason46Code#QuantityRejection
 * RejectionReason46Code.QuantityRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason46Code#RefusedByTaxAuthorities
 * RejectionReason46Code.RefusedByTaxAuthorities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason46Code#SafekeepingAccountRejection
 * RejectionReason46Code.SafekeepingAccountRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason46Code#UnrecognisedIdentification
 * RejectionReason46Code.UnrecognisedIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason46Code#AmountRejection
 * RejectionReason46Code.AmountRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason46Code#CurrencyRejection
 * RejectionReason46Code.CurrencyRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason46Code#InstructionTypeRejection
 * RejectionReason46Code.InstructionTypeRejection}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
 * RejectionReasonV3Code}</li>
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
 * "RejectionReason46Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason why the instruction request has a rejected status."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.RejectionReason43Code
 * RejectionReason43Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RejectionReason46Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason46Code
	 * RejectionReason46Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerDeadlineMissed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason43Code#AccountServicerDeadlineMissed
	 * RejectionReason43Code.AccountServicerDeadlineMissed}</li>
	 * </ul>
	 */
	public static final RejectionReason46Code AccountServicerDeadlineMissed = new RejectionReason46Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerDeadlineMissed";
			previousVersion_lazy = () -> RejectionReason43Code.AccountServicerDeadlineMissed;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason46Code.mmObject();
			codeName = RejectionReasonV3Code.AccountServicerDeadlineMissed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason46Code
	 * RejectionReason46Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectCertification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason43Code#IncorrectCertification
	 * RejectionReason43Code.IncorrectCertification}</li>
	 * </ul>
	 */
	public static final RejectionReason46Code IncorrectCertification = new RejectionReason46Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectCertification";
			previousVersion_lazy = () -> RejectionReason43Code.IncorrectCertification;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason46Code.mmObject();
			codeName = RejectionReasonV3Code.IncorrectCertification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason46Code
	 * RejectionReason46Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidForTaxAuthorities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason43Code#InvalidForTaxAuthorities
	 * RejectionReason43Code.InvalidForTaxAuthorities}</li>
	 * </ul>
	 */
	public static final RejectionReason46Code InvalidForTaxAuthorities = new RejectionReason46Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidForTaxAuthorities";
			previousVersion_lazy = () -> RejectionReason43Code.InvalidForTaxAuthorities;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason46Code.mmObject();
			codeName = RejectionReasonV3Code.InvalidForTaxAuthorities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason46Code
	 * RejectionReason46Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidOptionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason43Code#InvalidOptionType
	 * RejectionReason43Code.InvalidOptionType}</li>
	 * </ul>
	 */
	public static final RejectionReason46Code InvalidOptionType = new RejectionReason46Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidOptionType";
			previousVersion_lazy = () -> RejectionReason43Code.InvalidOptionType;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason46Code.mmObject();
			codeName = RejectionReasonV3Code.InvalidOptionType.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason46Code
	 * RejectionReason46Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason43Code#InvalidReference
	 * RejectionReason43Code.InvalidReference}</li>
	 * </ul>
	 */
	public static final RejectionReason46Code InvalidReference = new RejectionReason46Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidReference";
			previousVersion_lazy = () -> RejectionReason43Code.InvalidReference;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason46Code.mmObject();
			codeName = RejectionReasonV3Code.InvalidReference.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason46Code
	 * RejectionReason46Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason43Code#InvalidSecurity
	 * RejectionReason43Code.InvalidSecurity}</li>
	 * </ul>
	 */
	public static final RejectionReason46Code InvalidSecurity = new RejectionReason46Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidSecurity";
			previousVersion_lazy = () -> RejectionReason43Code.InvalidSecurity;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason46Code.mmObject();
			codeName = RejectionReasonV3Code.InvalidSecurity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason46Code
	 * RejectionReason46Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LackofSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason43Code#LackofSecurities
	 * RejectionReason43Code.LackofSecurities}</li>
	 * </ul>
	 */
	public static final RejectionReason46Code LackofSecurities = new RejectionReason46Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LackofSecurities";
			previousVersion_lazy = () -> RejectionReason43Code.LackofSecurities;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason46Code.mmObject();
			codeName = RejectionReasonV3Code.LackofSecurities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason46Code
	 * RejectionReason46Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketDeadlineMissed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason43Code#MarketDeadlineMissed
	 * RejectionReason43Code.MarketDeadlineMissed}</li>
	 * </ul>
	 */
	public static final RejectionReason46Code MarketDeadlineMissed = new RejectionReason46Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketDeadlineMissed";
			previousVersion_lazy = () -> RejectionReason43Code.MarketDeadlineMissed;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason46Code.mmObject();
			codeName = RejectionReasonV3Code.MarketDeadlineMissed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason46Code
	 * RejectionReason46Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mismatch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason43Code#Mismatch
	 * RejectionReason43Code.Mismatch}</li>
	 * </ul>
	 */
	public static final RejectionReason46Code Mismatch = new RejectionReason46Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Mismatch";
			previousVersion_lazy = () -> RejectionReason43Code.Mismatch;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason46Code.mmObject();
			codeName = RejectionReasonV3Code.Mismatch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason46Code
	 * RejectionReason46Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingBeneficiaryOwnerDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason43Code#MissingBeneficiaryOwnerDetails
	 * RejectionReason43Code.MissingBeneficiaryOwnerDetails}</li>
	 * </ul>
	 */
	public static final RejectionReason46Code MissingBeneficiaryOwnerDetails = new RejectionReason46Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingBeneficiaryOwnerDetails";
			previousVersion_lazy = () -> RejectionReason43Code.MissingBeneficiaryOwnerDetails;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason46Code.mmObject();
			codeName = RejectionReasonV3Code.MissingBeneficiaryOwnerDetails.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason46Code
	 * RejectionReason46Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionCancelled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason43Code#OptionCancelled
	 * RejectionReason43Code.OptionCancelled}</li>
	 * </ul>
	 */
	public static final RejectionReason46Code OptionCancelled = new RejectionReason46Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionCancelled";
			previousVersion_lazy = () -> RejectionReason43Code.OptionCancelled;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason46Code.mmObject();
			codeName = RejectionReasonV3Code.OptionCancelled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason46Code
	 * RejectionReason46Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionInactive"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason43Code#OptionInactive
	 * RejectionReason43Code.OptionInactive}</li>
	 * </ul>
	 */
	public static final RejectionReason46Code OptionInactive = new RejectionReason46Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionInactive";
			previousVersion_lazy = () -> RejectionReason43Code.OptionInactive;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason46Code.mmObject();
			codeName = RejectionReasonV3Code.OptionInactive.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason46Code
	 * RejectionReason46Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumberRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason43Code#OptionNumberRejection
	 * RejectionReason43Code.OptionNumberRejection}</li>
	 * </ul>
	 */
	public static final RejectionReason46Code OptionNumberRejection = new RejectionReason46Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumberRejection";
			previousVersion_lazy = () -> RejectionReason43Code.OptionNumberRejection;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason46Code.mmObject();
			codeName = RejectionReasonV3Code.OptionNumberRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason46Code
	 * RejectionReason46Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason43Code#Other
	 * RejectionReason43Code.Other}</li>
	 * </ul>
	 */
	public static final RejectionReason46Code Other = new RejectionReason46Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			previousVersion_lazy = () -> RejectionReason43Code.Other;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason46Code.mmObject();
			codeName = RejectionReasonV3Code.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason46Code
	 * RejectionReason46Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason43Code#QuantityRejection
	 * RejectionReason43Code.QuantityRejection}</li>
	 * </ul>
	 */
	public static final RejectionReason46Code QuantityRejection = new RejectionReason46Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityRejection";
			previousVersion_lazy = () -> RejectionReason43Code.QuantityRejection;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason46Code.mmObject();
			codeName = RejectionReasonV3Code.QuantityRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason46Code
	 * RejectionReason46Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RefusedByTaxAuthorities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason43Code#RefusedByTaxAuthorities
	 * RejectionReason43Code.RefusedByTaxAuthorities}</li>
	 * </ul>
	 */
	public static final RejectionReason46Code RefusedByTaxAuthorities = new RejectionReason46Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RefusedByTaxAuthorities";
			previousVersion_lazy = () -> RejectionReason43Code.RefusedByTaxAuthorities;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason46Code.mmObject();
			codeName = RejectionReasonV3Code.RefusedByTaxAuthorities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason46Code
	 * RejectionReason46Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccountRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason43Code#SafekeepingAccountRejection
	 * RejectionReason43Code.SafekeepingAccountRejection}</li>
	 * </ul>
	 */
	public static final RejectionReason46Code SafekeepingAccountRejection = new RejectionReason46Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccountRejection";
			previousVersion_lazy = () -> RejectionReason43Code.SafekeepingAccountRejection;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason46Code.mmObject();
			codeName = RejectionReasonV3Code.SafekeepingAccountRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason46Code
	 * RejectionReason46Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnrecognisedIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason43Code#UnrecognisedIdentification
	 * RejectionReason43Code.UnrecognisedIdentification}</li>
	 * </ul>
	 */
	public static final RejectionReason46Code UnrecognisedIdentification = new RejectionReason46Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnrecognisedIdentification";
			previousVersion_lazy = () -> RejectionReason43Code.UnrecognisedIdentification;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason46Code.mmObject();
			codeName = RejectionReasonV3Code.UnrecognisedIdentification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason46Code
	 * RejectionReason46Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountRejection"</li>
	 * </ul>
	 */
	public static final RejectionReason46Code AmountRejection = new RejectionReason46Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountRejection";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason46Code.mmObject();
			codeName = RejectionReasonV3Code.AmountRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason46Code
	 * RejectionReason46Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyRejection"</li>
	 * </ul>
	 */
	public static final RejectionReason46Code CurrencyRejection = new RejectionReason46Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyRejection";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason46Code.mmObject();
			codeName = RejectionReasonV3Code.CurrencyRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason46Code
	 * RejectionReason46Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionTypeRejection"</li>
	 * </ul>
	 */
	public static final RejectionReason46Code InstructionTypeRejection = new RejectionReason46Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionTypeRejection";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason46Code.mmObject();
			codeName = RejectionReasonV3Code.InstructionTypeRejection.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, RejectionReason46Code> codesByName = new LinkedHashMap<>();

	protected RejectionReason46Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RejectionReason46Code";
				definition = "Specifies the reason why the instruction request has a rejected status.";
				previousVersion_lazy = () -> RejectionReason43Code.mmObject();
				trace_lazy = () -> RejectionReasonV3Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RejectionReason46Code.AccountServicerDeadlineMissed, com.tools20022.repository.codeset.RejectionReason46Code.IncorrectCertification,
						com.tools20022.repository.codeset.RejectionReason46Code.InvalidForTaxAuthorities, com.tools20022.repository.codeset.RejectionReason46Code.InvalidOptionType,
						com.tools20022.repository.codeset.RejectionReason46Code.InvalidReference, com.tools20022.repository.codeset.RejectionReason46Code.InvalidSecurity,
						com.tools20022.repository.codeset.RejectionReason46Code.LackofSecurities, com.tools20022.repository.codeset.RejectionReason46Code.MarketDeadlineMissed,
						com.tools20022.repository.codeset.RejectionReason46Code.Mismatch, com.tools20022.repository.codeset.RejectionReason46Code.MissingBeneficiaryOwnerDetails,
						com.tools20022.repository.codeset.RejectionReason46Code.OptionCancelled, com.tools20022.repository.codeset.RejectionReason46Code.OptionInactive,
						com.tools20022.repository.codeset.RejectionReason46Code.OptionNumberRejection, com.tools20022.repository.codeset.RejectionReason46Code.Other,
						com.tools20022.repository.codeset.RejectionReason46Code.QuantityRejection, com.tools20022.repository.codeset.RejectionReason46Code.RefusedByTaxAuthorities,
						com.tools20022.repository.codeset.RejectionReason46Code.SafekeepingAccountRejection, com.tools20022.repository.codeset.RejectionReason46Code.UnrecognisedIdentification,
						com.tools20022.repository.codeset.RejectionReason46Code.AmountRejection, com.tools20022.repository.codeset.RejectionReason46Code.CurrencyRejection,
						com.tools20022.repository.codeset.RejectionReason46Code.InstructionTypeRejection);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AccountServicerDeadlineMissed.getCodeName().get(), AccountServicerDeadlineMissed);
		codesByName.put(IncorrectCertification.getCodeName().get(), IncorrectCertification);
		codesByName.put(InvalidForTaxAuthorities.getCodeName().get(), InvalidForTaxAuthorities);
		codesByName.put(InvalidOptionType.getCodeName().get(), InvalidOptionType);
		codesByName.put(InvalidReference.getCodeName().get(), InvalidReference);
		codesByName.put(InvalidSecurity.getCodeName().get(), InvalidSecurity);
		codesByName.put(LackofSecurities.getCodeName().get(), LackofSecurities);
		codesByName.put(MarketDeadlineMissed.getCodeName().get(), MarketDeadlineMissed);
		codesByName.put(Mismatch.getCodeName().get(), Mismatch);
		codesByName.put(MissingBeneficiaryOwnerDetails.getCodeName().get(), MissingBeneficiaryOwnerDetails);
		codesByName.put(OptionCancelled.getCodeName().get(), OptionCancelled);
		codesByName.put(OptionInactive.getCodeName().get(), OptionInactive);
		codesByName.put(OptionNumberRejection.getCodeName().get(), OptionNumberRejection);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(QuantityRejection.getCodeName().get(), QuantityRejection);
		codesByName.put(RefusedByTaxAuthorities.getCodeName().get(), RefusedByTaxAuthorities);
		codesByName.put(SafekeepingAccountRejection.getCodeName().get(), SafekeepingAccountRejection);
		codesByName.put(UnrecognisedIdentification.getCodeName().get(), UnrecognisedIdentification);
		codesByName.put(AmountRejection.getCodeName().get(), AmountRejection);
		codesByName.put(CurrencyRejection.getCodeName().get(), CurrencyRejection);
		codesByName.put(InstructionTypeRejection.getCodeName().get(), InstructionTypeRejection);
	}

	public static RejectionReason46Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RejectionReason46Code[] values() {
		RejectionReason46Code[] values = new RejectionReason46Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RejectionReason46Code> {
		@Override
		public RejectionReason46Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RejectionReason46Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}