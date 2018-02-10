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
import com.tools20022.repository.codeset.RejectionReason42Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason why the instruction/cancellation request has a rejected
 * status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason42Code#AccountServicerDeadlineMissed
 * RejectionReason42Code.AccountServicerDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason42Code#IncorrectCertification
 * RejectionReason42Code.IncorrectCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason42Code#InstructionIrrevocable
 * RejectionReason42Code.InstructionIrrevocable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason42Code#InvalidForTaxAuthorities
 * RejectionReason42Code.InvalidForTaxAuthorities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason42Code#InvalidOptionType
 * RejectionReason42Code.InvalidOptionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason42Code#InvalidReference
 * RejectionReason42Code.InvalidReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason42Code#InvalidSecurity
 * RejectionReason42Code.InvalidSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason42Code#LackofSecurities
 * RejectionReason42Code.LackofSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason42Code#MarketDeadlineMissed
 * RejectionReason42Code.MarketDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason42Code#Mismatch
 * RejectionReason42Code.Mismatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason42Code#MissingBeneficiaryOwnerDetails
 * RejectionReason42Code.MissingBeneficiaryOwnerDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason42Code#OptionCancelled
 * RejectionReason42Code.OptionCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason42Code#OptionInactive
 * RejectionReason42Code.OptionInactive}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason42Code#OptionNumberRejection
 * RejectionReason42Code.OptionNumberRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason42Code#Other
 * RejectionReason42Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason42Code#QuantityRejection
 * RejectionReason42Code.QuantityRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason42Code#RefusedByTaxAuthorities
 * RejectionReason42Code.RefusedByTaxAuthorities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason42Code#RejectedSinceAlreadyCancelled
 * RejectionReason42Code.RejectedSinceAlreadyCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason42Code#RejectedSinceInProgress
 * RejectionReason42Code.RejectedSinceInProgress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason42Code#SafekeepingAccountRejection
 * RejectionReason42Code.SafekeepingAccountRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason42Code#UnrecognisedIdentification
 * RejectionReason42Code.UnrecognisedIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV2Code
 * RejectionReasonV2Code}</li>
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
 * "RejectionReason42Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason why the instruction/cancellation request has a rejected status."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RejectionReason42Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason42Code
	 * RejectionReason42Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerDeadlineMissed"</li>
	 * </ul>
	 */
	public static final RejectionReason42Code AccountServicerDeadlineMissed = new RejectionReason42Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerDeadlineMissed";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason42Code.mmObject();
			codeName = RejectionReasonV2Code.AccountServicerDeadlineMissed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason42Code
	 * RejectionReason42Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectCertification"</li>
	 * </ul>
	 */
	public static final RejectionReason42Code IncorrectCertification = new RejectionReason42Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectCertification";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason42Code.mmObject();
			codeName = RejectionReasonV2Code.IncorrectCertification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason42Code
	 * RejectionReason42Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionIrrevocable"</li>
	 * </ul>
	 */
	public static final RejectionReason42Code InstructionIrrevocable = new RejectionReason42Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionIrrevocable";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason42Code.mmObject();
			codeName = RejectionReasonV2Code.InstructionIrrevocable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason42Code
	 * RejectionReason42Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidForTaxAuthorities"</li>
	 * </ul>
	 */
	public static final RejectionReason42Code InvalidForTaxAuthorities = new RejectionReason42Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidForTaxAuthorities";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason42Code.mmObject();
			codeName = RejectionReasonV2Code.InvalidForTaxAuthorities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason42Code
	 * RejectionReason42Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidOptionType"</li>
	 * </ul>
	 */
	public static final RejectionReason42Code InvalidOptionType = new RejectionReason42Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidOptionType";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason42Code.mmObject();
			codeName = RejectionReasonV2Code.InvalidOptionType.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason42Code
	 * RejectionReason42Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidReference"</li>
	 * </ul>
	 */
	public static final RejectionReason42Code InvalidReference = new RejectionReason42Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidReference";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason42Code.mmObject();
			codeName = RejectionReasonV2Code.InvalidReference.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason42Code
	 * RejectionReason42Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidSecurity"</li>
	 * </ul>
	 */
	public static final RejectionReason42Code InvalidSecurity = new RejectionReason42Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidSecurity";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason42Code.mmObject();
			codeName = RejectionReasonV2Code.InvalidSecurity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason42Code
	 * RejectionReason42Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LackofSecurities"</li>
	 * </ul>
	 */
	public static final RejectionReason42Code LackofSecurities = new RejectionReason42Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LackofSecurities";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason42Code.mmObject();
			codeName = RejectionReasonV2Code.LackofSecurities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason42Code
	 * RejectionReason42Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketDeadlineMissed"</li>
	 * </ul>
	 */
	public static final RejectionReason42Code MarketDeadlineMissed = new RejectionReason42Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketDeadlineMissed";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason42Code.mmObject();
			codeName = RejectionReasonV2Code.MarketDeadlineMissed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason42Code
	 * RejectionReason42Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mismatch"</li>
	 * </ul>
	 */
	public static final RejectionReason42Code Mismatch = new RejectionReason42Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Mismatch";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason42Code.mmObject();
			codeName = RejectionReasonV2Code.Mismatch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason42Code
	 * RejectionReason42Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingBeneficiaryOwnerDetails"</li>
	 * </ul>
	 */
	public static final RejectionReason42Code MissingBeneficiaryOwnerDetails = new RejectionReason42Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingBeneficiaryOwnerDetails";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason42Code.mmObject();
			codeName = RejectionReasonV2Code.MissingBeneficiaryOwnerDetails.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason42Code
	 * RejectionReason42Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionCancelled"</li>
	 * </ul>
	 */
	public static final RejectionReason42Code OptionCancelled = new RejectionReason42Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionCancelled";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason42Code.mmObject();
			codeName = RejectionReasonV2Code.OptionCancelled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason42Code
	 * RejectionReason42Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionInactive"</li>
	 * </ul>
	 */
	public static final RejectionReason42Code OptionInactive = new RejectionReason42Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionInactive";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason42Code.mmObject();
			codeName = RejectionReasonV2Code.OptionInactive.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason42Code
	 * RejectionReason42Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumberRejection"</li>
	 * </ul>
	 */
	public static final RejectionReason42Code OptionNumberRejection = new RejectionReason42Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumberRejection";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason42Code.mmObject();
			codeName = RejectionReasonV2Code.OptionNumberRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason42Code
	 * RejectionReason42Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final RejectionReason42Code Other = new RejectionReason42Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason42Code.mmObject();
			codeName = RejectionReasonV2Code.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason42Code
	 * RejectionReason42Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityRejection"</li>
	 * </ul>
	 */
	public static final RejectionReason42Code QuantityRejection = new RejectionReason42Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityRejection";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason42Code.mmObject();
			codeName = RejectionReasonV2Code.QuantityRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason42Code
	 * RejectionReason42Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RefusedByTaxAuthorities"</li>
	 * </ul>
	 */
	public static final RejectionReason42Code RefusedByTaxAuthorities = new RejectionReason42Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RefusedByTaxAuthorities";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason42Code.mmObject();
			codeName = RejectionReasonV2Code.RefusedByTaxAuthorities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason42Code
	 * RejectionReason42Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedSinceAlreadyCancelled"</li>
	 * </ul>
	 */
	public static final RejectionReason42Code RejectedSinceAlreadyCancelled = new RejectionReason42Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedSinceAlreadyCancelled";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason42Code.mmObject();
			codeName = RejectionReasonV2Code.RejectedSinceAlreadyCancelled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason42Code
	 * RejectionReason42Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedSinceInProgress"</li>
	 * </ul>
	 */
	public static final RejectionReason42Code RejectedSinceInProgress = new RejectionReason42Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedSinceInProgress";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason42Code.mmObject();
			codeName = RejectionReasonV2Code.RejectedSinceInProgress.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason42Code
	 * RejectionReason42Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccountRejection"</li>
	 * </ul>
	 */
	public static final RejectionReason42Code SafekeepingAccountRejection = new RejectionReason42Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccountRejection";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason42Code.mmObject();
			codeName = RejectionReasonV2Code.SafekeepingAccountRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason42Code
	 * RejectionReason42Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnrecognisedIdentification"</li>
	 * </ul>
	 */
	public static final RejectionReason42Code UnrecognisedIdentification = new RejectionReason42Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnrecognisedIdentification";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason42Code.mmObject();
			codeName = RejectionReasonV2Code.UnrecognisedIdentification.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, RejectionReason42Code> codesByName = new LinkedHashMap<>();

	protected RejectionReason42Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RejectionReason42Code";
				definition = "Specifies the reason why the instruction/cancellation request has a rejected status.";
				trace_lazy = () -> RejectionReasonV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RejectionReason42Code.AccountServicerDeadlineMissed, com.tools20022.repository.codeset.RejectionReason42Code.IncorrectCertification,
						com.tools20022.repository.codeset.RejectionReason42Code.InstructionIrrevocable, com.tools20022.repository.codeset.RejectionReason42Code.InvalidForTaxAuthorities,
						com.tools20022.repository.codeset.RejectionReason42Code.InvalidOptionType, com.tools20022.repository.codeset.RejectionReason42Code.InvalidReference,
						com.tools20022.repository.codeset.RejectionReason42Code.InvalidSecurity, com.tools20022.repository.codeset.RejectionReason42Code.LackofSecurities,
						com.tools20022.repository.codeset.RejectionReason42Code.MarketDeadlineMissed, com.tools20022.repository.codeset.RejectionReason42Code.Mismatch,
						com.tools20022.repository.codeset.RejectionReason42Code.MissingBeneficiaryOwnerDetails, com.tools20022.repository.codeset.RejectionReason42Code.OptionCancelled,
						com.tools20022.repository.codeset.RejectionReason42Code.OptionInactive, com.tools20022.repository.codeset.RejectionReason42Code.OptionNumberRejection, com.tools20022.repository.codeset.RejectionReason42Code.Other,
						com.tools20022.repository.codeset.RejectionReason42Code.QuantityRejection, com.tools20022.repository.codeset.RejectionReason42Code.RefusedByTaxAuthorities,
						com.tools20022.repository.codeset.RejectionReason42Code.RejectedSinceAlreadyCancelled, com.tools20022.repository.codeset.RejectionReason42Code.RejectedSinceInProgress,
						com.tools20022.repository.codeset.RejectionReason42Code.SafekeepingAccountRejection, com.tools20022.repository.codeset.RejectionReason42Code.UnrecognisedIdentification);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AccountServicerDeadlineMissed.getCodeName().get(), AccountServicerDeadlineMissed);
		codesByName.put(IncorrectCertification.getCodeName().get(), IncorrectCertification);
		codesByName.put(InstructionIrrevocable.getCodeName().get(), InstructionIrrevocable);
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
		codesByName.put(RejectedSinceAlreadyCancelled.getCodeName().get(), RejectedSinceAlreadyCancelled);
		codesByName.put(RejectedSinceInProgress.getCodeName().get(), RejectedSinceInProgress);
		codesByName.put(SafekeepingAccountRejection.getCodeName().get(), SafekeepingAccountRejection);
		codesByName.put(UnrecognisedIdentification.getCodeName().get(), UnrecognisedIdentification);
	}

	public static RejectionReason42Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RejectionReason42Code[] values() {
		RejectionReason42Code[] values = new RejectionReason42Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RejectionReason42Code> {
		@Override
		public RejectionReason42Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RejectionReason42Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}