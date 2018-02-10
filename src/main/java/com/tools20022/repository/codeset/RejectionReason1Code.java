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
import com.tools20022.repository.codeset.RejectionReason1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.RejectionReason1Code#AccountServicerDeadlineMissed
 * RejectionReason1Code.AccountServicerDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason1Code#MarketDeadlineMissed
 * RejectionReason1Code.MarketDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason1Code#QuantityRejection
 * RejectionReason1Code.QuantityRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason1Code#InsufficientTresholdPosition
 * RejectionReason1Code.InsufficientTresholdPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason1Code#LackofSecurities
 * RejectionReason1Code.LackofSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason1Code#SafekeepingAccountRejection
 * RejectionReason1Code.SafekeepingAccountRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason1Code#RejectedByIssuerOrRegistrar
 * RejectionReason1Code.RejectedByIssuerOrRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason1Code#UnrecognizedIdentification
 * RejectionReason1Code.UnrecognizedIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason1Code#InvalidReference
 * RejectionReason1Code.InvalidReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason1Code#ProxyCardDiscrepancy
 * RejectionReason1Code.ProxyCardDiscrepancy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason1Code#PartialVoteNotAllowed
 * RejectionReason1Code.PartialVoteNotAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason1Code#SplitVoteNotAllowed
 * RejectionReason1Code.SplitVoteNotAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason1Code#MissingOrInvalidPOA
 * RejectionReason1Code.MissingOrInvalidPOA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason1Code#RegistrationDiscrepancy
 * RejectionReason1Code.RegistrationDiscrepancy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason1Code#InvalidSecurity
 * RejectionReason1Code.InvalidSecurity}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
 * RejectionReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ADEA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RejectionReason1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason why the instruction/cancellation request has a rejected status."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RejectionReason1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason1Code
	 * RejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerDeadlineMissed"</li>
	 * </ul>
	 */
	public static final RejectionReason1Code AccountServicerDeadlineMissed = new RejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerDeadlineMissed";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason1Code.mmObject();
			codeName = RejectionReasonCode.AccountServicerDeadlineMissed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason1Code
	 * RejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketDeadlineMissed"</li>
	 * </ul>
	 */
	public static final RejectionReason1Code MarketDeadlineMissed = new RejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketDeadlineMissed";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason1Code.mmObject();
			codeName = RejectionReasonCode.MarketDeadlineMissed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason1Code
	 * RejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityRejection"</li>
	 * </ul>
	 */
	public static final RejectionReason1Code QuantityRejection = new RejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityRejection";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason1Code.mmObject();
			codeName = RejectionReasonCode.QuantityRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason1Code
	 * RejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientTresholdPosition"</li>
	 * </ul>
	 */
	public static final RejectionReason1Code InsufficientTresholdPosition = new RejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientTresholdPosition";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason1Code.mmObject();
			codeName = RejectionReasonCode.InsufficientTresholdPosition.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason1Code
	 * RejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LackofSecurities"</li>
	 * </ul>
	 */
	public static final RejectionReason1Code LackofSecurities = new RejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LackofSecurities";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason1Code.mmObject();
			codeName = RejectionReasonCode.LackofSecurities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason1Code
	 * RejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccountRejection"</li>
	 * </ul>
	 */
	public static final RejectionReason1Code SafekeepingAccountRejection = new RejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccountRejection";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason1Code.mmObject();
			codeName = RejectionReasonCode.SafekeepingAccountRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason1Code
	 * RejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedByIssuerOrRegistrar"</li>
	 * </ul>
	 */
	public static final RejectionReason1Code RejectedByIssuerOrRegistrar = new RejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedByIssuerOrRegistrar";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason1Code.mmObject();
			codeName = RejectionReasonCode.RejectedByIssuerOrRegistrar.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason1Code
	 * RejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnrecognizedIdentification"</li>
	 * </ul>
	 */
	public static final RejectionReason1Code UnrecognizedIdentification = new RejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnrecognizedIdentification";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason1Code.mmObject();
			codeName = RejectionReasonCode.UnrecognizedIdentification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason1Code
	 * RejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidReference"</li>
	 * </ul>
	 */
	public static final RejectionReason1Code InvalidReference = new RejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidReference";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason1Code.mmObject();
			codeName = RejectionReasonCode.InvalidReference.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason1Code
	 * RejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProxyCardDiscrepancy"</li>
	 * </ul>
	 */
	public static final RejectionReason1Code ProxyCardDiscrepancy = new RejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProxyCardDiscrepancy";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason1Code.mmObject();
			codeName = RejectionReasonCode.ProxyCardDiscrepancy.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason1Code
	 * RejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialVoteNotAllowed"</li>
	 * </ul>
	 */
	public static final RejectionReason1Code PartialVoteNotAllowed = new RejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialVoteNotAllowed";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason1Code.mmObject();
			codeName = RejectionReasonCode.PartialVoteNotAllowed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason1Code
	 * RejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SplitVoteNotAllowed"</li>
	 * </ul>
	 */
	public static final RejectionReason1Code SplitVoteNotAllowed = new RejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SplitVoteNotAllowed";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason1Code.mmObject();
			codeName = RejectionReasonCode.SplitVoteNotAllowed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason1Code
	 * RejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingOrInvalidPOA"</li>
	 * </ul>
	 */
	public static final RejectionReason1Code MissingOrInvalidPOA = new RejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingOrInvalidPOA";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason1Code.mmObject();
			codeName = RejectionReasonCode.MissingOrInvalidPOA.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason1Code
	 * RejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationDiscrepancy"</li>
	 * </ul>
	 */
	public static final RejectionReason1Code RegistrationDiscrepancy = new RejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationDiscrepancy";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason1Code.mmObject();
			codeName = RejectionReasonCode.RegistrationDiscrepancy.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason1Code
	 * RejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidSecurity"</li>
	 * </ul>
	 */
	public static final RejectionReason1Code InvalidSecurity = new RejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidSecurity";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason1Code.mmObject();
			codeName = RejectionReasonCode.InvalidSecurity.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, RejectionReason1Code> codesByName = new LinkedHashMap<>();

	protected RejectionReason1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ADEA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RejectionReason1Code";
				definition = "Specifies the reason why the instruction/cancellation request has a rejected status.";
				trace_lazy = () -> RejectionReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RejectionReason1Code.AccountServicerDeadlineMissed, com.tools20022.repository.codeset.RejectionReason1Code.MarketDeadlineMissed,
						com.tools20022.repository.codeset.RejectionReason1Code.QuantityRejection, com.tools20022.repository.codeset.RejectionReason1Code.InsufficientTresholdPosition,
						com.tools20022.repository.codeset.RejectionReason1Code.LackofSecurities, com.tools20022.repository.codeset.RejectionReason1Code.SafekeepingAccountRejection,
						com.tools20022.repository.codeset.RejectionReason1Code.RejectedByIssuerOrRegistrar, com.tools20022.repository.codeset.RejectionReason1Code.UnrecognizedIdentification,
						com.tools20022.repository.codeset.RejectionReason1Code.InvalidReference, com.tools20022.repository.codeset.RejectionReason1Code.ProxyCardDiscrepancy,
						com.tools20022.repository.codeset.RejectionReason1Code.PartialVoteNotAllowed, com.tools20022.repository.codeset.RejectionReason1Code.SplitVoteNotAllowed,
						com.tools20022.repository.codeset.RejectionReason1Code.MissingOrInvalidPOA, com.tools20022.repository.codeset.RejectionReason1Code.RegistrationDiscrepancy,
						com.tools20022.repository.codeset.RejectionReason1Code.InvalidSecurity);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AccountServicerDeadlineMissed.getCodeName().get(), AccountServicerDeadlineMissed);
		codesByName.put(MarketDeadlineMissed.getCodeName().get(), MarketDeadlineMissed);
		codesByName.put(QuantityRejection.getCodeName().get(), QuantityRejection);
		codesByName.put(InsufficientTresholdPosition.getCodeName().get(), InsufficientTresholdPosition);
		codesByName.put(LackofSecurities.getCodeName().get(), LackofSecurities);
		codesByName.put(SafekeepingAccountRejection.getCodeName().get(), SafekeepingAccountRejection);
		codesByName.put(RejectedByIssuerOrRegistrar.getCodeName().get(), RejectedByIssuerOrRegistrar);
		codesByName.put(UnrecognizedIdentification.getCodeName().get(), UnrecognizedIdentification);
		codesByName.put(InvalidReference.getCodeName().get(), InvalidReference);
		codesByName.put(ProxyCardDiscrepancy.getCodeName().get(), ProxyCardDiscrepancy);
		codesByName.put(PartialVoteNotAllowed.getCodeName().get(), PartialVoteNotAllowed);
		codesByName.put(SplitVoteNotAllowed.getCodeName().get(), SplitVoteNotAllowed);
		codesByName.put(MissingOrInvalidPOA.getCodeName().get(), MissingOrInvalidPOA);
		codesByName.put(RegistrationDiscrepancy.getCodeName().get(), RegistrationDiscrepancy);
		codesByName.put(InvalidSecurity.getCodeName().get(), InvalidSecurity);
	}

	public static RejectionReason1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RejectionReason1Code[] values() {
		RejectionReason1Code[] values = new RejectionReason1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RejectionReason1Code> {
		@Override
		public RejectionReason1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RejectionReason1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}