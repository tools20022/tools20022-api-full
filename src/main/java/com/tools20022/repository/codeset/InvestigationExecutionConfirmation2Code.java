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
import com.tools20022.repository.codeset.InvestigationExecutionConfirmation2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates the result of an investigation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation2Code#CancelledAsPerRequest
 * InvestigationExecutionConfirmation2Code.CancelledAsPerRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation2Code#ModifiedAsPerRequest
 * InvestigationExecutionConfirmation2Code.ModifiedAsPerRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation2Code#PaymentInitiated
 * InvestigationExecutionConfirmation2Code.PaymentInitiated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation2Code#CoverInitiated
 * InvestigationExecutionConfirmation2Code.CoverInitiated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation2Code#CoverModified
 * InvestigationExecutionConfirmation2Code.CoverModified}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation2Code#AdditionalInformationSent
 * InvestigationExecutionConfirmation2Code.AdditionalInformationSent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation2Code#ConfirmationOfPayment
 * InvestigationExecutionConfirmation2Code.ConfirmationOfPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation2Code#CancellationWillFollow
 * InvestigationExecutionConfirmation2Code.CancellationWillFollow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation2Code#ModificationWillFollow
 * InvestigationExecutionConfirmation2Code.ModificationWillFollow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation2Code#UnableToApplyWillFollow
 * InvestigationExecutionConfirmation2Code.UnableToApplyWillFollow}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode
 * InvestigationExecutionConfirmationCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CNCL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvestigationExecutionConfirmation2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Indicates the result of an investigation."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class InvestigationExecutionConfirmation2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation2Code
	 * InvestigationExecutionConfirmation2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledAsPerRequest"</li>
	 * </ul>
	 */
	public static final InvestigationExecutionConfirmation2Code CancelledAsPerRequest = new InvestigationExecutionConfirmation2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledAsPerRequest";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestigationExecutionConfirmation2Code.mmObject();
			codeName = InvestigationExecutionConfirmationCode.CancelledAsPerRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation2Code
	 * InvestigationExecutionConfirmation2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModifiedAsPerRequest"</li>
	 * </ul>
	 */
	public static final InvestigationExecutionConfirmation2Code ModifiedAsPerRequest = new InvestigationExecutionConfirmation2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedAsPerRequest";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestigationExecutionConfirmation2Code.mmObject();
			codeName = InvestigationExecutionConfirmationCode.ModifiedAsPerRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation2Code
	 * InvestigationExecutionConfirmation2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInitiated"</li>
	 * </ul>
	 */
	public static final InvestigationExecutionConfirmation2Code PaymentInitiated = new InvestigationExecutionConfirmation2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInitiated";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestigationExecutionConfirmation2Code.mmObject();
			codeName = InvestigationExecutionConfirmationCode.PaymentInitiated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation2Code
	 * InvestigationExecutionConfirmation2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoverInitiated"</li>
	 * </ul>
	 */
	public static final InvestigationExecutionConfirmation2Code CoverInitiated = new InvestigationExecutionConfirmation2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoverInitiated";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestigationExecutionConfirmation2Code.mmObject();
			codeName = InvestigationExecutionConfirmationCode.CoverInitiated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation2Code
	 * InvestigationExecutionConfirmation2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoverModified"</li>
	 * </ul>
	 */
	public static final InvestigationExecutionConfirmation2Code CoverModified = new InvestigationExecutionConfirmation2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoverModified";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestigationExecutionConfirmation2Code.mmObject();
			codeName = InvestigationExecutionConfirmationCode.CoverModified.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation2Code
	 * InvestigationExecutionConfirmation2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationSent"</li>
	 * </ul>
	 */
	public static final InvestigationExecutionConfirmation2Code AdditionalInformationSent = new InvestigationExecutionConfirmation2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationSent";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestigationExecutionConfirmation2Code.mmObject();
			codeName = InvestigationExecutionConfirmationCode.AdditionalInformationSent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation2Code
	 * InvestigationExecutionConfirmation2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationOfPayment"</li>
	 * </ul>
	 */
	public static final InvestigationExecutionConfirmation2Code ConfirmationOfPayment = new InvestigationExecutionConfirmation2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationOfPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestigationExecutionConfirmation2Code.mmObject();
			codeName = InvestigationExecutionConfirmationCode.ConfirmationOfPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation2Code
	 * InvestigationExecutionConfirmation2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationWillFollow"</li>
	 * </ul>
	 */
	public static final InvestigationExecutionConfirmation2Code CancellationWillFollow = new InvestigationExecutionConfirmation2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationWillFollow";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestigationExecutionConfirmation2Code.mmObject();
			codeName = InvestigationExecutionConfirmationCode.CancellationWillFollow.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation2Code
	 * InvestigationExecutionConfirmation2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModificationWillFollow"</li>
	 * </ul>
	 */
	public static final InvestigationExecutionConfirmation2Code ModificationWillFollow = new InvestigationExecutionConfirmation2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModificationWillFollow";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestigationExecutionConfirmation2Code.mmObject();
			codeName = InvestigationExecutionConfirmationCode.ModificationWillFollow.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation2Code
	 * InvestigationExecutionConfirmation2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToApplyWillFollow"</li>
	 * </ul>
	 */
	public static final InvestigationExecutionConfirmation2Code UnableToApplyWillFollow = new InvestigationExecutionConfirmation2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToApplyWillFollow";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestigationExecutionConfirmation2Code.mmObject();
			codeName = InvestigationExecutionConfirmationCode.UnableToApplyWillFollow.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, InvestigationExecutionConfirmation2Code> codesByName = new LinkedHashMap<>();

	protected InvestigationExecutionConfirmation2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CNCL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestigationExecutionConfirmation2Code";
				definition = "Indicates the result of an investigation.";
				trace_lazy = () -> InvestigationExecutionConfirmationCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InvestigationExecutionConfirmation2Code.CancelledAsPerRequest,
						com.tools20022.repository.codeset.InvestigationExecutionConfirmation2Code.ModifiedAsPerRequest, com.tools20022.repository.codeset.InvestigationExecutionConfirmation2Code.PaymentInitiated,
						com.tools20022.repository.codeset.InvestigationExecutionConfirmation2Code.CoverInitiated, com.tools20022.repository.codeset.InvestigationExecutionConfirmation2Code.CoverModified,
						com.tools20022.repository.codeset.InvestigationExecutionConfirmation2Code.AdditionalInformationSent, com.tools20022.repository.codeset.InvestigationExecutionConfirmation2Code.ConfirmationOfPayment,
						com.tools20022.repository.codeset.InvestigationExecutionConfirmation2Code.CancellationWillFollow, com.tools20022.repository.codeset.InvestigationExecutionConfirmation2Code.ModificationWillFollow,
						com.tools20022.repository.codeset.InvestigationExecutionConfirmation2Code.UnableToApplyWillFollow);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CancelledAsPerRequest.getCodeName().get(), CancelledAsPerRequest);
		codesByName.put(ModifiedAsPerRequest.getCodeName().get(), ModifiedAsPerRequest);
		codesByName.put(PaymentInitiated.getCodeName().get(), PaymentInitiated);
		codesByName.put(CoverInitiated.getCodeName().get(), CoverInitiated);
		codesByName.put(CoverModified.getCodeName().get(), CoverModified);
		codesByName.put(AdditionalInformationSent.getCodeName().get(), AdditionalInformationSent);
		codesByName.put(ConfirmationOfPayment.getCodeName().get(), ConfirmationOfPayment);
		codesByName.put(CancellationWillFollow.getCodeName().get(), CancellationWillFollow);
		codesByName.put(ModificationWillFollow.getCodeName().get(), ModificationWillFollow);
		codesByName.put(UnableToApplyWillFollow.getCodeName().get(), UnableToApplyWillFollow);
	}

	public static InvestigationExecutionConfirmation2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static InvestigationExecutionConfirmation2Code[] values() {
		InvestigationExecutionConfirmation2Code[] values = new InvestigationExecutionConfirmation2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, InvestigationExecutionConfirmation2Code> {
		@Override
		public InvestigationExecutionConfirmation2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(InvestigationExecutionConfirmation2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}